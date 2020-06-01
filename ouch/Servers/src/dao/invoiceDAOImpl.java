package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mypack.Invoice;

@Repository
@Transactional
public class invoiceDAOImpl implements invoiceDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Invoice> getInvoice()
	{
		List<Invoice>mylist=(List<Invoice>) template.find("from Invoice");
		return mylist;
	}
}
