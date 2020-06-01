package dao;

import java.util.List;

import mypack.Catsubcat;
import mypack.Customer;

public interface customerDAO
{
	List<Customer> getCustomer();
	
	void addCustomer(Customer c);
	
	void update(Customer c,int id);
	
	void delete(int custid);
}
