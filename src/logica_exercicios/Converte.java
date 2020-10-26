package logica_exercicios;

import javax.swing.JOptionPane;

public class Converte {

	public static void main(String[] args) {
		int soma, soma1;
		String varDigitada = JOptionPane.showInputDialog(null, "Digite um numero");
		String varDigitada1 = JOptionPane.showInputDialog(null, "Digite mais um numero");
		soma = Integer.parseInt(varDigitada);
		soma1 = Integer.parseInt(varDigitada1);
		
		soma1 = soma1 + soma;
		
		JOptionPane.showConfirmDialog(null, "O resultado da soma e = "+soma1);

	}

}
