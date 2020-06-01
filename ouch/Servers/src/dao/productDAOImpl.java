package dao;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import mypack.Product;

@Repository
@Transactional
public class productDAOImpl implements productDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Product> getProduct(String pname)
	{
		System.out.println(pname);
		List<Product> mylist= (List<Product>) template.find("select p.image, p.pname, p.pdet, p.price, p.primeprice, p.redeempoints from Product p where p.pname=?",pname);
		System.out.println(pname);
		return mylist;
	}	
}
