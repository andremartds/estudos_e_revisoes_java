package logica_exercicios;

import javax.swing.*;

class CLerNotaIf {
	public static void main(String args[]) {
		float nota1 = Float.parseFloat(JOptionPane
				.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane
				.showInputDialog("Digite a segunda nota"));
		float fCalcMedia = (nota1 + nota2) / 2;

		if (fCalcMedia >= 6)
			JOptionPane.showMessageDialog(null, "sua media � = " + fCalcMedia
					+ " voce foi aprovado");
		else
			JOptionPane.showMessageDialog(null, "sua media � = " + fCalcMedia
					+ " voce foi reprovado");
	}
}
