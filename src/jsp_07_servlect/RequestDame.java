package jsp_07_servlect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.offcn.jdbc.JDBCDemo;

public class RequestDame extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RequestDame() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//仅限于POST
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String tex= request.getParameter("gender");
		String email = request.getParameter("email");
//		//String sql= "insert into customer(user,password,email,sex)values('"+username+"','"+password+"','"+email+"','"+tex+"')";
//		try {
//			int i = JDBCDemo.getStatement().executeUpdate(sql);
//			if(i>0){
//				request.setAttribute("msg", "你好，你一注册成功");
//				request.getRequestDispatcher("/html/login.jsp").forward(request, response);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String sql = "insert into customer(user,password,email,sex)values(?,?,?,?)";
		try {
		PreparedStatement Ps = JDBCDemo.getPStatement(sql);//实例化PreParedStatement对象  作用；发送sql语句，让数据库执行
		Ps.setString(1,username);
		Ps.setString(2,password );
		Ps.setString(3,email );
		Ps.setString(4,tex );
		int i =Ps.executeUpdate();
			if(i>0){
				request.setAttribute("msg", "你好。你已注册成功");
				request.getRequestDispatcher("/html/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		request.setAttribute("msg","注册成功 ，请登录" );
//	    request.getRequestDispatcher("/html/login.jsp").forward(request, response);		
		//response.sendRedirect("/Jsp_08_JDBC/html/login.jsp");//跳转页面的地址不能传值；地址改变
	
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
