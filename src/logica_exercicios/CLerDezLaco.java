package logica_exercicios;

import javax.swing.*;

class CLerDezLaco {
	public static void main(String args[]) {
		String sMensagem;
		int i = Integer.parseInt(JOptionPane.showInputDialog(null,
				"digite o numero para verifica��o"));

		if (i % 2 == 0) {
				sMensagem = " O Numero � par " + i + "\n";
			} else
				sMensagem = " O Numero n�o � par " + i + "\n";
		
		JOptionPane.showMessageDialog(null, sMensagem);

		}

	}