package template.blank.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import template.blank.persistence.ExemploDAO;

@Service
public class ExemploManager extends AbstractManager<ExemploDAO> implements
		IExemploManager {

	@Autowired
	private ExemploDAO exemploDao;

	@Override	
	public Double buscarValor(String codigo) {
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
