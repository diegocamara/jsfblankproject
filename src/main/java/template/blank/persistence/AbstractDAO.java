package template.blank.persistence;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class AbstractDAO <E>{

	private Session session;
	private Class<E> persistentClass;
	
	public AbstractDAO(String schema){
		sessionCreate(schema);
	}
	
	private void sessionCreate(String schema){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(schema);
		EntityManager manager = factory.createEntityManager();
		session = (Session) manager.getDelegate();
		persistentClass = (Class<E>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Criteria createCriteria(){
		
		Criteria criteria = session.createCriteria(getEntityClass());
		
		return criteria;
	}
	
	Class<E> getEntityClass(){
		return persistentClass;
	}
	
		
}
