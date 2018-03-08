package com.offcn.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.offcn.model.Customer;
import com.offcn.pool.C3P0Pool;

public class CustomerDaoImpl implements CustomerDao {
	
	QueryRunner qr = new QueryRunner(C3P0Pool.getDataSource());
	@Override
	public int AddCustomer(Customer c) {
		
		String sql = "insert into customer(user,password,email,sex)values(?,?,?,?)";
		
		Object[] params = {c.getUser(),c.getPassword(),c.getEmail(),c.getSex()};
		try {
			return qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public int DelCustomer(int cid) {
		String sql = "delect * from customer where CID"
		return 0;
	}

	@Override
	public int UpdateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List QueryAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
