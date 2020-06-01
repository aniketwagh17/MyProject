package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.cartManager;
import mypack.Cart;
import mypack.Customer;


@RestController  
@CrossOrigin("http://localhost:4200")
public class cartController 
{

	@Autowired
	cartManager manager;
	
	@GetMapping(value = "crud/cart",headers = "Accept=application/json")  
	 public String showCart()
	 {
		//System.out.println(oid);
		  return  new Gson().toJson(manager.getCart());
	 }
	
	
	@PutMapping(value = "crud/update1/{oid}",headers = "Accept=application/json")  
	 public void updatepro(@RequestBody Cart c,@PathVariable int oid)
	 {
		System.out.println("update called");
		manager.update(c,oid);
	 }
	
	@DeleteMapping(value = "crud/delete1/{oid}", headers = "Accept=application/json")  
	 public void removepro(@PathVariable int oid)
	 {
		manager.delete(oid);
	 }
	
	/*@PostMapping(value = "crud/add1", headers = "Accept=application/xml")  
	 public void addcart(@RequestBody Cart c)
	 {
		System.out.println("addcart called");
		System.out.println("hi"+c);
		manager.addCart(c);
	 }*/
	
	
	
}


