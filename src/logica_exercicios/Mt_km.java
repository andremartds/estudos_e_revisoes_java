package logica_exercicios;

import javax.swing.*;

class Mt_km {
	public static void main(String args[]) {
		float km, mt;
		km = 0;
		mt = 0;
		km = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Escreva quantos km por hora"));
		mt = km / 3.6f;
		JOptionPane.showMessageDialog(null, "O valor de km em Mt �" + mt);

	}
}