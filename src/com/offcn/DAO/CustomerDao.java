package com.offcn.DAO;

import java.util.List;

import com.offcn.model.Customer;

public interface CustomerDao {
	public int AddCustomer(Customer c);
	public int DelCustomer(int cid );
	public int UpdateCustomer(Customer c);
	public Customer queryById(int id);
	public List QueryAll();
}
