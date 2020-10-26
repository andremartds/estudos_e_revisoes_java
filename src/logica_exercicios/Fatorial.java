package logica_exercicios;

public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 4;
		double result = 1;
		for (int i = 1; i < fatorial; i++) {
			result = result * (i + 1);
		}

		System.out.println(result);

	}

}
