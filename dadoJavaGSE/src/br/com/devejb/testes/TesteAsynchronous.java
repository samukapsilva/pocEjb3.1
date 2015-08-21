package br.com.devejb.testes;

import java.util.Map;
import java.util.concurrent.Future;

import javax.naming.InitialContext;

import br.com.devejb.sessionbeans.LancadorDeDado;

public class TesteAsynchronous {

	public static void main ( String [] args ) throws Exception {
		 InitialContext ic = new InitialContext ();
		
		 LancadorDeDado lancadorDeDado = ( LancadorDeDado )ic.lookup("java:global/dadoGWeb/LancadorDeDadoBean");
		 Future <Map<Integer, Integer>> future = lancadorDeDado.calculaFrequencia();
		
		 System.out.print(" Aguardando ");
		
		 while (!future.isDone()){
		 System.out.print ("*");
		 Thread.sleep(1000) ;
		 }
		 System.out.println("\n" + future.get());
	}
}