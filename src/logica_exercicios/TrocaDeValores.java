package logica_exercicios;

import javax.swing.JOptionPane;

class TrocaDeValores {
	public static void main(String args[]) {
		int a, b, auxiliar;

		a = 5;
		b = 10;
		auxiliar = a;

		a = b;
		b = auxiliar;
		
		

		JOptionPane.showMessageDialog(null, "o valor de a �  " + a
				+ " \n\n o valor de b � \n\n " + b);

	}
}