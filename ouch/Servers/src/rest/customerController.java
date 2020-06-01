package rest;

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

import manager.customerManager;
import mypack.Customer;

@RestController  
@CrossOrigin("http://localhost:4200")
public class customerController
{
	@Autowired
	customerManager manager;
	
	@GetMapping(value = "crud/customer",headers = "Accept=application/json")  
	 public String showProducts()
	 {
		  return new Gson().toJson(manager.getCustomer());
	 }
	
	@PostMapping(value = "crud/add", headers = "Accept=application/xml")  
	 public void addcust(@RequestBody Customer c)
	 {
		System.out.println("addcust called");
		manager.addCustomer(c);
	 }
	
	@PutMapping(value = "crud/update/{custid}",headers = "Accept=application/json")  
	 public void updatepro(@RequestBody Customer c,@PathVariable int custid)
	 {
		System.out.println("update called");
		manager.update(c,custid);
	 }
	
	@DeleteMapping(value = "crud/delete/{custid}", headers = "Accept=application/json")  
	 public void removepro(@PathVariable int custid)
	 {
		manager.delete(custid);
	 }
}
