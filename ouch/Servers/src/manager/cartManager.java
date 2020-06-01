package manager;

import java.util.List;
import mypack.Cart;
import mypack.Customer;

public interface cartManager 
{

	List<Cart> getCart();
	
	void update(Cart c,int oid);
	
	void delete(int oid);
	
	void addCart(Cart c);
	
}
