package logica_exercicios;

import javax.swing.*;

class CMaiorEMenorValor {
	public static void main(String args[]) {
		int v1 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o valor 01"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o valor 02"));
		int v3 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o valor 03"));
		int v4 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o valor 04"));

		if (v1 > v2 && v1 > v3 && v1 > v4)
			JOptionPane.showMessageDialog(null, " O MAIOR VALOR � O " + v1);
		else if (v1 < v2 && v1 < v3 && v1 < v4)
			JOptionPane.showMessageDialog(null, " O MENOR VALOR � " + v1);

		if (v2 > v1 && v2 > v3 && v2 > v4)
			JOptionPane.showMessageDialog(null, " O MAIOR VALOR � " + v2);
		else if (v2 < v1 && v2 < v3 && v2 < v4)
			JOptionPane.showMessageDialog(null, " O MENOR VALOR � " + v2);

		if (v3 > v1 && v3 > v2 && v3 > v4)
			JOptionPane.showMessageDialog(null, " O MAIOR VALOR � " + v3);
		else if (v3 < v1 && v3 < v2 && v3 < v4)
			JOptionPane.showMessageDialog(null, " O MENOR VALOR � " + v3);

		if (v4 > v1 && v4 > v3 && v4 > v2)
			JOptionPane.showMessageDialog(null, " O MAIOR VALOR � " + v4);
		else if (v4 < v1 && v4 < v2 && v4 < v3)
			JOptionPane.showMessageDialog(null, " O MENOR VALOR � " + v4);

		JOptionPane.showConfirmDialog(null, "ordem de valores \n valor 1 = "
				+ v1 + "\n valor 2 = " + v2 + "\n valor 3 = " + v3
				+ "\n valor 4 = " + v4);

	}
}