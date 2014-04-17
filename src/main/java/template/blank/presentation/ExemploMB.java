package template.blank.presentation;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

import template.blank.business.ExemploManager;

import template.blank.util.*;

@ManagedBean
@RequestScoped
public class ExemploMB extends AbstractMB {

	private ExemploManager exemploManager;
	private double resultado;
	

	@Override
	void inicializar() {		
		this.exemploManager = new ExemploManager();
	}
	
	public void buscar(){
		resultado = this.exemploManager.buscarValor("1");
	}

	public ExemploManager getExemploManager() {
		return exemploManager;
	}

	public void setExemploManager(ExemploManager exemploManager) {
		this.exemploManager = exemploManager;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getMsg(){
		return MessagesUtil.getMessage("message2","Test3");
	}
	
	
}
