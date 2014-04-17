package template.blank.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import template.blank.business.ExemploEntity;

public class ExemploDAO extends AbstractDAO<ExemploEntity> {

	public ExemploDAO(String schema) {
		super(schema);
	}

	public Double buscarValor(String codigo){
		
		Criteria criteria = createCriteria();
		
		criteria.add(Restrictions.eq("codigo", codigo));

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("valor"));

		criteria.setProjection(projectionList);
		
		return (Double)criteria.uniqueResult();
		
	}
	
}
