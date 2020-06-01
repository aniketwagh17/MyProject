package manager;

import java.util.List;

import mypack.Customer;

public interface customerManager
{
	List<Customer> getCustomer();
	
	void addCustomer(Customer c);
	
	void update(Customer c,int custid);
	
	void delete(int custid);
	
	
}
