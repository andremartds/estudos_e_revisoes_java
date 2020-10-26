package logica_exercicios;

import javax.swing.*;

/*
 * Autor Andr� Martins
 */
public class CCrescenteAB {
	public static void main(String args[]) {
		int iACrescente = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de A"));
		int iBCrescente = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de B"));
		if (iACrescente > iBCrescente) {
			JOptionPane.showMessageDialog(null, " O valor de B � "
					+ iBCrescente + " - O valor de A � " + iACrescente);
		} else
			JOptionPane.showMessageDialog(null, " O valor de A � "
					+ iACrescente + " - O valor de B � " + iBCrescente);
	}
}