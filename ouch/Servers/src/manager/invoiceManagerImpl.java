package manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.invoiceDAO;
import mypack.Invoice;

@Service
public class invoiceManagerImpl implements invoiceManager
{

	@Autowired
	invoiceDAO dao;
	
	@Override
	public List<Invoice> getInvoice() {
		// TODO Auto-generated method stub
		return dao.getInvoice();
	}
}
