package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.catsubcatManager;

@RestController  
@CrossOrigin("http://localhost:4200")
public class catsubcatController
{
	@Autowired
	catsubcatManager manager;
	
	@GetMapping(value = "crud/catsubcat/{cname}", headers ="Accept=application/json")
	 public String showProducts(@PathVariable String cname)
	 {
		System.out.println(cname);
		  return new Gson().toJson(manager.getCatsubcat(cname));
	 }	
}
