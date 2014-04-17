package template.blank.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBEXEMPLO")
public class ExemploEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;

	@Column
	@Size(min = 1, max = 100)
	private Double valor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}