package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.productManager;

@RestController  
@CrossOrigin("http://localhost:4200")
public class productController
{
	@Autowired
	productManager manager;
	
	@GetMapping(value = "crud/product/{pname}", headers ="Accept=application/json")
	 public String showProducts(@PathVariable String pname)
	 {
		System.out.println(pname);
		return new Gson().toJson(manager.getProduct(pname));
	 }	
}

