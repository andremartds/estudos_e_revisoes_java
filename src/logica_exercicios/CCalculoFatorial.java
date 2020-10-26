package logica_exercicios;

import javax.swing.*;

class CCalculoFatorial {
	public static void main(String args[]) {
		int iEscape = 1;
		int iNumeroFatorial = Integer
				.parseInt(JOptionPane
						.showInputDialog("Digite o numero Fatorial para sua multiplica��o"));
		for (int i = 1; i <= iNumeroFatorial; i++) {
			iEscape = iEscape * i;
		}
		System.out.println(" " + iEscape);

	}
}