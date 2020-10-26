package logica_exercicios;

import javax.swing.*;
import java.util.Scanner;

public class CTesteScanner {
	public static void main(String args[]) {
		CMetodo nome = new CMetodo();
		nome.nome();

	}
}

class CMetodo {
	private String nome;

	public String getNome() {
		return nome;
	}

	void setNome(String pNome) {
		nome = pNome;
	}

	@SuppressWarnings("resource")
	public void nome() {
		System.out.println("Qual � o seu nome");
		String sRecebeNome = new Scanner(System.in).nextLine();
		JOptionPane.showMessageDialog(null, "ola como vai " + sRecebeNome);
	}
}
