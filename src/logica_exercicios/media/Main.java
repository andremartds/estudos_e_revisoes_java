package logica_exercicios.media;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroAlunos = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de alunos"));
		int i = 0;

		Faculdade faculdade = new Faculdade();
		ArrayList<Faculdade> alunos = new ArrayList<Faculdade>();
		while (numeroAlunos > i) {
			System.out.println("DIGITE O NOME DO ALUNO: ");
			alunos.add(faculdade);
			faculdade.setNome(scan.next());

			System.out.println("DIGITE A nota da A1: ");
			Double nota = Double.parseDouble(scan.next());
			faculdade.setNotaA1(nota);

			System.out.println("DIGITE A nota da A2: ");
			Double nota2 = Double.parseDouble(scan.next());
			faculdade.setNotaA2(nota2);

			faculdade.media();

			i++;
		}

	}
}
