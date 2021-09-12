package oo.aviao_01;

import java.util.ArrayList;

public class Compahia {
	String sNomeDaCompahia;
	ArrayList<Voo> vetVoos = new ArrayList<Voo>();
	
	Compahia (String sNome){
		this.sNomeDaCompahia = sNome;
	}
	
	void adcionaVoo(Voo pvoo){
		vetVoos.add(pvoo);		
	}
	Voo getVooPorNumero(int numero){		
		for(int i=0;i<vetVoos.size();i++){
			if(vetVoos.get(i).numeroVoo == numero){
				return vetVoos.get(i);
			}
		}
		return null;
		
	}
	
}
