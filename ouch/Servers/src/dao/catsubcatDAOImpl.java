package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import mypack.Catsubcat;

@Repository
@Transactional
public class catsubcatDAOImpl implements catsubcatDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Catsubcat> getCatsubcat(String cname)
	{
		/*Session session=template.getSessionFactory().getCurrentSession();
		
		Query query=session.createSQLQuery(
				"CALL  get_catsubcat(:cname)").addEntity(Catsubcat.class).setParameter("cname",cname);
				
	List<Catsubcat> list=query.list();
	
	return list;*/
				
		
		List<Catsubcat> mylist= (List<Catsubcat>) template.find("select c.name from Catsubcat c where c.cname=?",cname);
		System.out.println(cname);
		return mylist;
	}	
}
