package com.offcn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/qingzhulianglping?useEncode=true&&character=utf-8";
		String user = "root";
		String password = "123456";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url, user, password);
		return con;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
public static  Statement getStatement() throws SQLException{
	return getConnection().createStatement();

}
public static PreparedStatement getPStatement(String sql) throws SQLException{
	return getConnection().prepareStatement(sql);
} 
public void freeResource(Connection con,Statement stat,PreparedStatement pstat,ResultSet rs) throws SQLException{
	if(rs!=null&&!rs.isClosed()){
		rs.close();
	}
	if(pstat!=null&&!pstat.isClosed()){
		pstat.close();
	}
		
	if(stat!=null&&!stat.isClosed()){
		stat.close();
	}
	if(con!=null&&!con.isClosed()){
		con.close();
	}
}
}