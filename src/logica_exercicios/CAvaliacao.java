package logica_exercicios;

import javax.swing.JOptionPane;
// 	REVISADA 09/09/2020
public class CAvaliacao {
	public static void main(String args[]) {
		float fNota[] = new float[3];
		fNota[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		fNota[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		fNota[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));
		float fMedia = (fNota[0] * 2 / 10 + fNota[1] * 3 / 10 + fNota[2] * 5 / 10);

		String sResultado;
		if (fMedia >= 7) {
			sResultado = "aprovado";
		} else if (fMedia >= 4) {
			sResultado = "Recuperação";
		} else {
			sResultado = "Reprovado";
		}
		JOptionPane.showMessageDialog(null, sResultado + " . Sua nota foi " + fMedia);
	}
}