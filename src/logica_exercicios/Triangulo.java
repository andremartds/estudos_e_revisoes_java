package logica_exercicios;

import javax.swing.*;

class Triangulo {
	public static void main(String args[]) {
		int le = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado esquerdo"));
		int ld = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado direito"));
		int li = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado inferior"));

		if ((le == ld) && (ld == li)) {
			JOptionPane.showConfirmDialog(null, "triangulo equilatero");
		} else if ((li == ld) || (li == le) || (le == ld)) {
			JOptionPane.showConfirmDialog(null, "triangulo  isosceles");
		} else if ((li < (le + ld)) || (le < (ld + li)) || (ld < (li + le))) {
			JOptionPane.showConfirmDialog(null, "triangulo escaleno");
		} else {
			JOptionPane.showConfirmDialog(null, "não é um triangulo");
		}

	}
}
