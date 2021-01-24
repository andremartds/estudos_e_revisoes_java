package logica_exercicios;

public class ExemploIF {

	public static void main(String[] args) {
		// exemplo 01 verifica se é igual a 10
		int nota = 10;
		if (nota == 10) {
			System.out.println("é maior");
		} else {
			System.out.println("não é maior");
		}
		
		System.out.println("##########################################");
		
		// exemplo 02: verifica se é par
		double numero = 5;
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("Impar");
		}
		
		System.out.println("##########################################");

		// exemplo 03: media
		double nota01 = 6;
		double nota02 = 5;
		double nota03 = 5;

		double media = (nota01 + nota02 + nota03) / 3;

		if (media > 5 && media < 6) {
			System.out.println("Você ficou de recuperação");
		} else if (media > 6 && media < 9) {
			System.out.println("Você passou");
		} else if (media > 9) {
			System.out.println("Você passou, você arrazou!");
		} else {
			System.out.println("tente novamente");
		}
	}

}
