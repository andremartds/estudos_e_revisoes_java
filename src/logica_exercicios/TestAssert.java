package logica_exercicios;

import java.util.Scanner;

public class TestAssert {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seus numeros entre 1 e 10");
		int n = s.nextInt();
		assert(n >= 0 && n <= 10);
			System.out.println("assertions habilitadas ");


	}

}
