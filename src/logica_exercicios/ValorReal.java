package logica_exercicios;

import javax.swing.*;

class ValorReal {
	public static void main(String args[]) {
		mostraReal();
	}

	public static void mostraReal() {

		float fdolar = 0f, escape = 0f, fcota_dolar = 0;
		fdolar = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Digite o quanto voc� tem em dolar"));
		fcota_dolar = Float.parseFloat(JOptionPane.showInputDialog(null,
				"Digite a cota��o do dolar"));

		escape = fdolar * fcota_dolar;
		JOptionPane.showMessageDialog(null, "o valor em real que voc� tem � "
				+ escape);

	}
}