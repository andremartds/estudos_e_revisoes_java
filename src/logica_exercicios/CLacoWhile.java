package logica_exercicios;

import javax.swing.JOptionPane;

class CLacoWhile {
	public static void main(String args[]) {
		String recebe = "";
		int numero = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o numero para sua multiplicado"));
		int i = 1;
		while (i <= 10) {
			recebe = recebe + "\n" + numero + " x " + i + " = " + (numero * i);
			i++;
		}
		JOptionPane.showMessageDialog(null, recebe);
	}
}