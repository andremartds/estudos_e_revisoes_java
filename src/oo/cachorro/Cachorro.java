package oo.cachorro;

public class Cachorro {
	String sRaca;
	int iTamanho;
	private String sNome;

	void vLatir() {
		System.out.println("Au, Au Auuuuu");
	}
	void vLatir(String nome) {
		System.out.println(nome + "Está Latindo ... Au, Au Auuuuu");
	}

	public String getNome() {
		return sNome;
	}

	public String setNome(String novoNome) {
		return this.sNome = novoNome;
	}

}
