package logica_exercicios;

import javax.swing.*;

class CSwith {
	public static void main(String args[]) {
		Integer iMes = new Integer(Integer.parseInt(JOptionPane
				.showInputDialog("digite o mes de 1 a 12 do Ano")));
		switch (iMes) {
		case 1:
			JOptionPane.showConfirmDialog(null, "Janeiro");
			break;
		case 2:
			JOptionPane.showConfirmDialog(null, "fevereiro");
			break;
		case 3:
			JOptionPane.showConfirmDialog(null, "mar�o");
			break;
		case 4:
			JOptionPane.showConfirmDialog(null, "abril");
			break;
		case 5:
			JOptionPane.showConfirmDialog(null, "maio");
			break;
		case 6:
			JOptionPane.showConfirmDialog(null, "junho");
			break;
		case 7:
			JOptionPane.showConfirmDialog(null, "julho");
			break;
		case 8:
			JOptionPane.showConfirmDialog(null, "agosto");
			break;
		case 9:
			JOptionPane.showConfirmDialog(null, "Setembro");
			break;
		case 10:
			JOptionPane.showConfirmDialog(null, "Outubro");
			break;
		case 11:
			JOptionPane.showConfirmDialog(null, "Novembro");
			break;
		case 12:
			JOptionPane.showConfirmDialog(null, "Dezembro");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "esse m�s n�o existe");

		}

	}
}