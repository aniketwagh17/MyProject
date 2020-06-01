package manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.productDAO;
import mypack.Product;

@Service
public class productManagerImpl implements productManager
{
	@Autowired
	productDAO dao;

	@Override
	public List<Product> getProduct(String pname)
	{
		System.out.println(pname);
		return dao.getProduct(pname);
	}
}
