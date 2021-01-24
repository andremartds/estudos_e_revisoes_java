package logica_exercicios;

import java.util.Scanner;

public class ConversorKM {

	public static void main(String[] args) {

		double valor = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor a ser convertido: ");

		valor = leitor.nextDouble();

		System.out.println("Escolha o tipo de Conversão: ");

		System.out.println("1 - Km para Metros");

		System.out.println("2 - Metros para Km");

		int opcao = leitor.nextInt();

		if (opcao == 1) {
			valor = valor * 1000;
			System.out.println("O valor em Km é: " + valor + "km");

		}
		else if (opcao == 2) {
			valor = valor / 1000;
			System.out.println("O valor em Metros é: " + valor + "m");
		}

		else {
			System.out.println("OPÇÃO INVÁLIDA: ");
		}

	}

}
