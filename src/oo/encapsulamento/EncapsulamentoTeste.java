package oo.encapsulamento;

public class EncapsulamentoTeste {
	public static void main(String[]args){
		Cavalo sibiscuite = new Cavalo();
		sibiscuite.setNome("sibiscuite");
		sibiscuite.setRaca("Manga Larga");
		sibiscuite.setCidade("Gurupi");
		sibiscuite.imprimeTudo();
		
		Cavalo fred = new Cavalo("fred ","Quarto de Milha ","Palmas ");
		fred.setNome("Novo nome ");
		fred.imprimeTudo();
		
	}

}
