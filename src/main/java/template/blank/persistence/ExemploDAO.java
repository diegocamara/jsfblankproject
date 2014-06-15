package template.blank.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import template.blank.business.ExemploEntity;

@Repository
public class ExemploDAO extends AbstractDAO<ExemploEntity> {

	
	public Double buscarValor(int codigo) {

		Criteria criteria = createCriteria();

		criteria.add(Restrictions.eq("codigo", codigo));

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("valor"));

		criteria.setProjection(projectionList);

		return (Double) criteria.uniqueResult();

	}

}
