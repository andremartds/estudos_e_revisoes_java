package oo.assertion;

import java.util.Scanner;

public class CAssertion {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Digite o numero de 0 a 19");
		int iNumero = s.nextInt();
		assert (iNumero >= 0 && iNumero <= 19) : "O numero que voc� digitou est� incorreto "+iNumero;
		System.out.println("o Numero digitado foi " + iNumero);

	}

}
