package template.blank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import template.blank.business.ExemploEntity;
import template.blank.persistence.ExemploDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "applicationContext-test.xml" })
public class AbstractDAOTest {

	private @Autowired
	SessionFactory sessionFactory;

	@Autowired
	private ExemploDAO exemploDAO;

	@Test
	public void hsqldbTest() {
		ExemploEntity exemploEntity1 = new ExemploEntity();
		
		exemploEntity1.setValor(100.0);

		save(exemploEntity1);

		ExemploEntity exemploEntity2 = new ExemploEntity();

		save(exemploEntity2);

		Double valorEsperado = exemploDAO.buscarValor(exemploEntity1
				.getCodigo());

		Assert.assertEquals("RESULTADO DEVERIA SER IGUAL", valorEsperado);
	}

	@Transactional
	public void save(Object object) {		  
		  
		Transaction transaction = getSession().beginTransaction();
		getSession().save(object);
		transaction.commit();
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
