package logica_exercicios;

import javax.swing.*;
// 	REVISADA 09/09/2020

class VefificaSeEDivisivel {
	public static void main(String args[]) {
		float fValorA = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Digite O valor de A "));
		float fValorB = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Digite o valor de B"));
		float fVariavelDeArmazenamento = fValorA % fValorB;
		if (fVariavelDeArmazenamento == 0) {
			JOptionPane.showConfirmDialog(null, "A é Divisivel por B");
		} else {
			JOptionPane.showConfirmDialog(null, "A não é divisivel Por B");
			JOptionPane.showConfirmDialog(null, " o valor da divisão é = "
					+ fValorA / fValorB);
		}

	}
}
