package template.blank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
public abstract class AbstractDAOTest extends AbstractTest{

	private @Autowired
	SessionFactory sessionFactory;
	private Session session;	
	
	public void save(Object object) {

		//Transaction transaction = getSession().beginTransaction();
		getCurrentSession().save(object);
		//transaction.commit();
		getCurrentSession().flush();
	}

	protected Session getCurrentSession() {
		if (session == null) {
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}

}
