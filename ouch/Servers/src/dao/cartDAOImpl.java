package dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import mypack.Cart;
import mypack.Customer;

@Repository
@Transactional
public class cartDAOImpl implements cartDAO
{
		@Autowired
		HibernateTemplate template;
		
		@Override
		public List<Cart> getCart()
		{
		//	System.out.println(oid);
			List<Cart> mylist=(List<Cart>)template.find("from Cart c");
			return mylist;
		}
		

		@Override
		public void update(Cart c,int oid)
		{
			template.bulkUpdate("update Cart c set c.quantity=?,c.pointchkbox=?,c.address=? where c.oid=?",c.getQuantity(),c.isPointchkbox(),c.getAddress(),oid);
			//template.update(template.get(Customer.class, custid));
		}
		
		@Override
		public void delete(int oid)
		{
			template.delete(template.get(Cart.class, oid));
		}
		
		@Override
		public void addCart(Cart c)
	
			System.out.println("hiii"+c);
			template.save(c);
		}
	}

	

