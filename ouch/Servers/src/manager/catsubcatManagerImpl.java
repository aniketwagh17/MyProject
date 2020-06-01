package manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.catsubcatDAO;
import mypack.Catsubcat;

@Service
public class catsubcatManagerImpl implements catsubcatManager
{
	@Autowired
	catsubcatDAO dao;

	@Override
	public List<Catsubcat> getCatsubcat(String cname)
	{
		return dao.getCatsubcat(cname);
	}
}
