package br.com.devejb.testes;

import java.util.Map;
import java.util.concurrent.Future;

import javax.naming.InitialContext;

import br.com.devejb.sessionbeans.LancadorDeDado;

public class TesteCicloDeVidaSLSB {

	
	public static void main ( String [] args ) throws Exception {
		
		InitialContext ic = new InitialContext();
		
		 for ( int i = 0; i < 100; i ++) {
			 final LancadorDeDado lancadorDeDado = ( LancadorDeDado )ic.lookup("java:global/dadoGWeb/LancadorDeDadoBean");
		
			 
			 Thread thread = new Thread ( new Runnable () {
			
				 @Override
				 public void run () {
					 for (int i = 0; i < 100; i ++) {
						 System.out.println( lancadorDeDado.lanca());
					 }
				 	}
			 
			 });
			 thread.start();
		 }
	}
}