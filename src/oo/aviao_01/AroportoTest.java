package oo.aviao_01;

public class AroportoTest {

	public static void main(String[] args) {
		/*cria uma compahia e adiciona dois voos a mesma*/
		Compahia vrTam = new Compahia("TAM");
		vrTam.adcionaVoo(new Voo(1020,"Palmas",null));
		vrTam.adcionaVoo(new Voo(1045,null,"Salvador"));
		
		/*cria um aeropor e adiciona uma compahia ao mesmo */
		Aeroporto vrCongonhas = new Aeroporto("Campinas");
		vrCongonhas.adcionaCompahia(vrTam);
		
		
		
		/*Imprime o resultado da busca*/
		System.out.println(vrCongonhas.buscaVooPorNumeroCOmpahia(1020, "TAM"));
		
	}

}
