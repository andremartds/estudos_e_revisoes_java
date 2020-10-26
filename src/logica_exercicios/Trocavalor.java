package logica_exercicios;

import javax.swing.*;

class Trocavalor {
	public static void main(String args[]) {
		int v1, v2, v3, aux;
		v1 = 0;
		v2 = 0;
		v3 = 0;
		aux = 0;
		v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor 1"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor 2"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor 3"));
		JOptionPane.showMessageDialog(null, " ordem digitada " + v1 + ", " + v2
				+ ", " + v3);
		
		if (v1 > v2) {
			aux = v1;
			v1 = v2;
			v2 = aux;
		}
		if (v2 > v3) {
			aux = v2;
			v2 = v3;
			v3 = aux;
		}
		if (v1 > v2) {
			aux = v1;
			v1 = v2;
			v2 = aux;
		}

		JOptionPane.showMessageDialog(null,
				"valores em ordem do menor para o maior = " + v1 + ", " + v2
						+ ", " + v3);// depois � s� imprimir...

	}
}