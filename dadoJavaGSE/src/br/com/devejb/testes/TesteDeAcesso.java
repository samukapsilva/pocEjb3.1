package br.com.devejb.testes;

import javax.naming.InitialContext;

import br.com.devejb.sessionbeans.LancadorDeDado;

public class TesteDeAcesso {

	public static void main(String[] args) throws Exception {
		InitialContext ic = new InitialContext();

		LancadorDeDado lancadorDeDado = (LancadorDeDado) ic.lookup("java:global/dadoGWeb/LancadorDeDadoBean");
		System.out.println(lancadorDeDado.lanca());
	}
}
