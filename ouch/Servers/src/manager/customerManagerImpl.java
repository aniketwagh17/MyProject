package manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.customerDAO;
import mypack.Customer;

@Service
public class customerManagerImpl implements customerManager
{
	@Autowired
	customerDAO dao;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return dao.getCustomer();
	}
	
	
	@Override
	public void addCustomer(Customer c)
	{
		// TODO Auto-generated method stub
		dao.addCustomer(c);
	}
	
	@Override
	public void update(Customer c,int custid) {
		// TODO Auto-generated method stub
		dao.update(c,custid);
		
	}
	
	@Override
	public void delete(int custid) {
		// TODO Auto-generated method stub
		dao.delete(custid);
	}

}
