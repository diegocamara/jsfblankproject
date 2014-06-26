package template.blank.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import template.blank.business.ExemploEntity;
import template.blank.persistence.ExemploDAO;

public class ExemploEntityDAOTest extends AbstractDAOTest {
	
	@Autowired
	private ExemploDAO exemploDAO;

	@Test
	public void hsqldbTest() {
		ExemploEntity exemploEntity1 = new ExemploEntity();

		exemploEntity1.setValor(100.0);

		save(exemploEntity1);

		ExemploEntity exemploEntity2 = new ExemploEntity();

		save(exemploEntity2);

		Double valorEsperado = 100.0;
				
		Double valorAtual =	exemploDAO.buscarValor(exemploEntity1
				.getCodigo());

		Assert.assertEquals("RESULTADO DEVERIA SER IGUAL",valorAtual, valorEsperado);
	}

}
