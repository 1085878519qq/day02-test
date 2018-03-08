package com.offcn.pool;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Pool {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	public static Connection getConnection(){
		try {
			System.out.println("厉害了成怕");
			
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return null;
			}
	public static ComboPooledDataSource getDataSource() {
		// TODO Auto-generated method stub
		return ds;
	}
}
