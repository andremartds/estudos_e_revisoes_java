package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo

class CMenorMaiorComIf {
	public static void main(String args[]) {
		int n1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de n1 "));
		int n2 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de n2 "));
		int n3 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de n3 "));

		if ((n1 <= n2) && (n1 <= n3)) {
			JOptionPane.showMessageDialog(null, "o numero menor �  \n  " + n1);
		} else if ((n2 <= n1) && (n2 <= n3)) {
			JOptionPane.showMessageDialog(null, "o numero menor �  \n  " + n2);
		} else
			JOptionPane.showMessageDialog(null, "O menor � o n3" + n3);

		if ((n1 >= n2) && (n1 >= n3)) {
			JOptionPane.showMessageDialog(null, "o numero maior �  \n  " + n1);
		} else if ((n2 >= n1) && (n2 >= n3)) {
			JOptionPane.showMessageDialog(null, "o numero maior �  \n  " + n2);
		} else
			JOptionPane.showMessageDialog(null, "O maior � o n .: " + n3);
	}
}