package template.blank.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import template.blank.business.IExemploManager;
import template.blank.util.MessagesUtil;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class ExemploMB extends AbstractMB {

	@Autowired
	private IExemploManager exemploManager;

	private double resultado;

	@Override
	void inicializar() {
		System.out.println();
	}

	public void buscar() {
		resultado = this.exemploManager.buscarValor(1);
	}

	public IExemploManager getExemploManager() {
		return exemploManager;
	}

	public void setExemploManager(IExemploManager exemploManager) {
		this.exemploManager = exemploManager;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getMsg() {
		return MessagesUtil.getMessage("message2", "Test3");
	}

}
