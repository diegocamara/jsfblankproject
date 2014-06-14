package template.blank.persistence;

import java.lang.reflect.ParameterizedType;

import javax.annotation.PostConstruct;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class AbstractDAO <E>{
	
	private @Autowired SessionFactory sessionFactory;	
	
	private Class<E> persistentClass;	
	
	@PostConstruct
	private void sessionCreate(){		
		persistentClass = (Class<E>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Criteria createCriteria(){
		
		Criteria criteria = getSession().createCriteria(getEntityClass());
		
		return criteria;
	}
	
	protected Class<E> getEntityClass(){
		return persistentClass;
	}
	
		
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}
