package br.com.devejb.sessionbeans;

import java.util.Map;
import java.util.concurrent.Future;

public interface LancadorDeDado {
	int lanca ();
	Future <Map<Integer,Integer>> calculaFrequencia();	
}
