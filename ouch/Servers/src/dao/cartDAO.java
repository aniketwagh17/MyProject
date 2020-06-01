package dao;

import java.util.List;
import mypack.Cart;
import mypack.Customer;


public interface cartDAO 
{
	
	List<Cart> getCart();
	
	void update(Cart c,int oid);
	
	void delete(int oid);
	
	//Cart getCart(int oid);
	
	void addCart(Cart c);
}
