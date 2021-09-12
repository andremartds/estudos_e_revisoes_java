package oo.cachorro;

public class CachorroTeste {

	public static void main(String[] args) {
		Cachorro pinther = new Cachorro();
		
		
		pinther.iTamanho = 12;
		pinther.sRaca = "Pinther";		
		pinther.vLatir();
		
		Cachorro pitbull = new Cachorro();
		pitbull.iTamanho =50;
		pitbull.sRaca="Pitbull";
		pitbull.vLatir();
		
		Cachorro cStanciaNome = new Cachorro();
		cStanciaNome.getNome();
		String imprime = cStanciaNome.setNome("Andr� Martins");
		System.out.print(imprime);
		
	}

}
