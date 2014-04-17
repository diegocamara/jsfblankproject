package template.blank.business;

import template.blank.persistence.ExemploDAO;

public class ExemploManager extends AbstractManager<ExemploDAO> implements IExemploManager {

	private ExemploDAO exemploDao;

	public ExemploManager() {
		this.exemploDao = new ExemploDAO("blank");
	}

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
