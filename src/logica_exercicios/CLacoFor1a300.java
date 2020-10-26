package logica_exercicios;

import javax.swing.*;

class CLacoFor1a300 {
	public static void main(String args[]) {
		String sRecebeNome = "";
		for (int i = 10; i <= 300; i = i + 10) {
			sRecebeNome = sRecebeNome + i + " - ";
			if ((i == 100) || (i == 200) || (i == 300))
				sRecebeNome = sRecebeNome + "\n";
		}
		JOptionPane.showMessageDialog(null, sRecebeNome);
	}
}