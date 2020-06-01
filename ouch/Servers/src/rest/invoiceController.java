package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import manager.invoiceManager;
import mypack.Invoice;



@RestController  
@CrossOrigin("http://localhost:4200")
public class invoiceController 
{
	@Autowired
	invoiceManager manager;
	
	@GetMapping(value = "crud/invoice",headers = "Accept=application/json")  
	 public List<Invoice> showInvoice()
	 {
		  return manager.getInvoice();
	 }
}
