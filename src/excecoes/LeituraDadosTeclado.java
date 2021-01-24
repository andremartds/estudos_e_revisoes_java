package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Double altura = null;
		boolean flag = true;
		String nomeCompleto = null;
		String primeiroNome = null;
		int idade = 0;
		
		do {
			try {
				System.out.print("Digite seu nome completo: ");
				nomeCompleto = scan.nextLine();
				System.out.print("Digite seu primeiro nome: ");
				primeiroNome = scan.next();
				System.out.print("Digite sua idade: ");
				idade = scan.nextInt();
				System.out.print("Digite sua altura: ");
				altura = scan.nextDouble();
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("digite o numero com Virgula ex: 2,3");
			}
		} while(flag == true);
		JOptionPane.showMessageDialog(null,nomeCompleto + "\n" + primeiroNome + "\n" + idade + "\n" + altura);
			
		}

}
