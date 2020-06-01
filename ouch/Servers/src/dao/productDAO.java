package dao;

import java.util.List;

import mypack.Product;

public interface productDAO
{
	List<Product> getProduct(String pname);
}
