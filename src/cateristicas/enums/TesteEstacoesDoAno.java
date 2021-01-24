package cateristicas.enums;

public class TesteEstacoesDoAno {
	public static void main(String[] args) {
		EstacoesDoAno eda = EstacoesDoAno.INVERNO;
		System.out.println(eda); // apenas o valor da enum
		System.out.println(eda.ordinal()); //pega o valor da enum
		System.out.println(eda.getVal()); // pega o valor do enum de fato
		System.out.println(EstacoesDoAno.INVERNO.getVal());
		
	}
}
