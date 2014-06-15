package template.blank.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import template.blank.persistence.ExemploDAO;

@Service
public class ExemploManager extends AbstractManager<ExemploDAO> implements
		IExemploManager {

	@Autowired
	private ExemploDAO exemploDao;

	@Override	
	@Transactional
	public Double buscarValor(int codigo) {
		return this.exemploDao.buscarValor(codigo);
	}

	@Override
	public ExemploDAO getDao() {
		return exemploDao;
	}

	public ExemploDAO getExemploDao() {
		return exemploDao;
	}

	public void setExemploDao(ExemploDAO exemploDao) {
		this.exemploDao = exemploDao;
	}

}
