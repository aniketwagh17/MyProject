package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mypack.Catsubcat;
import mypack.Customer;

@Repository
@Transactional
public class customerDAOImpl implements customerDAO
{
	@Autowired
	HibernateTemplate template;
	
	
	@Override
	public List<Customer> getCustomer()
	{
		List<Customer>mylist=(List<Customer>) template.find("from Customer c");
		return mylist;
	}
	
	
	@Override
	public void addCustomer(Customer c)
	{
		template.save(c);
	}

	@Override
	public void update(Customer c,int custid)
	{
		template.bulkUpdate("update Customer c set c.name=?,c.email=?,c.mobno=?,c.age=?,c.gender=?,c.password=?,c.address=?,c.primemember=?,c.points=?  where c.custid=?",c.getName(),c.getEmail(),c.getMobno(),c.getAge(),c.getGender(),c.getPassword(),c.getAddress(),c.isPrimemember(),c.getPoints(),custid);
		//template.update(template.get(Customer.class, custid));
	}
	
	@Override
	public void delete(int custid)
	{
		template.delete(template.get(Customer.class, custid));
	}
}
