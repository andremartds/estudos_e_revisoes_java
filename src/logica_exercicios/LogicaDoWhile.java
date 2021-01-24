package logica_exercicios;

import java.util.Scanner;

public class LogicaDoWhile {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int soma = 0, num = 0, anterior = 0;
		do {
			System.out.println("Insira um ou mais números  ou (-1 ) para terminar");
			anterior = num;
			num = leitor.nextInt();
			if (num == -1) {
				anterior = 0;
			}
			soma = soma + anterior;

		} while (num!=(-1));

		System.out.println("O resultado de todas as operações " + soma);

	}

}
