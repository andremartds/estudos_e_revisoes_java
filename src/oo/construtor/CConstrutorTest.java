package oo.construtor;

public class CConstrutorTest {

	/**
	 * @param args
	 * Andr� Martins
	 */
	public static void main(String[] args) {
		CConstrutor ferrari = new CConstrutor(500,"Ferrari enzo","Vermelha");
			System.out.println(ferrari.velocidade);
			System.out.println(ferrari.modelo);
			System.out.println(ferrari.cor);
	}

}
