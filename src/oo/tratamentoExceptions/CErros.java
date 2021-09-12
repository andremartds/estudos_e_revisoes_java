package oo.tratamentoExceptions;

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class CErros {

	private static Scanner ler;

	public static void main(String[] args) {
		boolean bVerdadeiro = true;
		do {
			try {
				ler = new Scanner(System.in);
				System.out.print("Digite o primeiro Numero de sua ");
				int iNumero1 = ler.nextInt();
				System.out.print("Digite o segundo numero de sua Divis�o ");
				int iNumero2 = ler.nextInt();
				System.out.println("o valor de sua divis�o � = "+iNumero1 / iNumero2);
				bVerdadeiro = false;				
			} catch (ArithmeticException | InputMismatchException e1) {
				System.err.println("Favor digitar numeros inteiros ");
				ler.nextLine();//ignora as entradas erradas e com o la�o volta a executar
			}
			
		} while (bVerdadeiro);

	}
}
