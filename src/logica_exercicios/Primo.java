package logica_exercicios;

import javax.swing.JOptionPane;

class Primo {
	public static void main(String args[]) {
		int numero, contador, i;
		i = 2;
		contador = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite o numero "));
		
		while (i < numero) {
			if (numero % i == 0) contador++;
			i++;
		}
		
		if (contador > 0 || numero == 1) JOptionPane.showMessageDialog(null, "nao é primo " + numero);
		else JOptionPane.showMessageDialog(null, "é primo " + numero);
	}
}