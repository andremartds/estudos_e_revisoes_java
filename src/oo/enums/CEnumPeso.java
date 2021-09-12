package oo.enums;

public enum CEnumPeso {
	GR("kiloGrama"),KL("Kilo"),TKL("Tonelada");
	
	String nome;
	CEnumPeso(){
		
	}
	CEnumPeso(String pNome){
		this.nome = pNome;
	}
	
	
}
