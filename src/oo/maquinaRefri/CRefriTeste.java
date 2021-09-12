package oo.maquinaRefri;

public class CRefriTeste {

	public static void main(String[] args) {
		CRefrigerante isMaria = new CRefrigerante();
		isMaria.abasteceRefri();
		isMaria.setQuantidadeRefriEMarca(4,3);
		isMaria.setValorRefri(2);
		isMaria.minhagrana(45);
		isMaria.iTroco();
		isMaria.ValorSuficiente();
		isMaria.vImprimeResultado();
		
		isMaria.vNovaLinha();
		
		CRefrigerante andre = new CRefrigerante();//construtor quantidade e Tipo de Refrigerante
		andre.setQuantidadeRefriEMarca(10,3);
		andre.setValorRefri(2);
		andre.minhagrana(100);
		andre.iTroco();
		andre.ValorSuficiente();
		andre.vImprimeResultado();
		
		
		
		
	}

}
