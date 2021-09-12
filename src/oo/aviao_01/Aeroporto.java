package oo.aviao_01;

import java.util.ArrayList;

public class Aeroporto {
	String sNomeAeroporto;
	ArrayList<Compahia> contemCompahia = null;
	
	/*adiciona uma comphia */
	void adcionaCompahia(Compahia pCom){
		contemCompahia.add(pCom);
	}
	public Aeroporto(String sNome) {
		contemCompahia = new ArrayList<Compahia>();
	}
	Voo buscaVooPorNumeroCOmpahia(int pNumero, String sNomeCompahia){
		for (int i = 0; i < contemCompahia.size(); i++) {
			if(contemCompahia.get(i).sNomeDaCompahia.equals(sNomeCompahia)){
				return contemCompahia.get(i).getVooPorNumero(pNumero);
			}			
		}
		return null;
	}
	
}
