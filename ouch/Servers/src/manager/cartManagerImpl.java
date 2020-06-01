package manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.cartDAO;
import mypack.Cart;
import mypack.Customer;


@Service
public class cartManagerImpl implements cartManager
{

	@Autowired
	cartDAO dao;

	@Override
	public List<Cart> getCart() {
		//System.out.println(oid);
		// TODO Auto-generated method stub
		return dao.getCart();
	}
	
	
	@Override
	public void update(Cart c,int oid) {
		// TODO Auto-generated method stub
		dao.update(c,oid);
		
	}
	
	@Override
	public void delete(int oid) {
		// TODO Auto-generated method stub
		dao.delete(oid);
	}
	
	@Override
	public void addCart(Cart c)
	{
		// TODO Auto-generated method stub
		dao.addCart(c);
	}
}
