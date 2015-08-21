package br.com.devejb.managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.devejb.sessionbeans.LancadorDeDado;

@ManagedBean
public class DadoMB {
	@EJB
	private LancadorDeDado lancadorDeDadoBean;

	private int resultado;

	public void lancaDado() {
		this.resultado = this.lancadorDeDadoBean.lanca();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado ( int resultado ) {
		this.resultado = resultado ;
 }
}