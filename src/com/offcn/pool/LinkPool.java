package com.offcn.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

import com.offcn.jdbc.JDBCDemo;

/**
 * @author Administrator
 * 项目名称：Jsp_08_JDBC   
 * 类名称：LinkPool   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月23日 上午12:32:05   
 * 修改人：Administrator   
 * 修改时间：2017年12月23日 上午12:32:05   
 * 修改备注：   
 * @version    
 *    
 */
public class LinkPool {
	public static LinkedList <Connection> pr = new LinkedList();
	public static int maxCount =30;//最大数创建数
	public static int minCount = 5;//最小
	public static int capacity = 10;//池的大小
	
	static {
	for(int i=0; i<capacity;i++){//初始化连接词
		try {
			pr.addLast(JDBCDemo.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("初始化");
	}
public static Connection getConnection() throws SQLException{
	if(pr.size()==0){
		for(int i=0;i<minCount;i++){
			pr.addLast(JDBCDemo.getConnection());
		}System.out.println("创建连接");
	}System.out.println("分配连接");
	return pr.removeFirst();
}
public static void freeConn(Connection conn)
{
	if(pr.size()>=maxCount){
		try {
			conn.close();
			System.out.println("关闭了连接");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		pr.addLast(conn);
		System.out.println("回收了连接");
	}
}
}
