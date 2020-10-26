package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo

class Saldo {
	public static void main(String args[]) {
		float saldo, chuq_entrou;

		saldo = 500;

		saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do seu Saldo"));
		chuq_entrou = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do chque que entrou"));

		if (chuq_entrou <= saldo) {
			saldo = saldo - chuq_entrou;
			JOptionPane.showMessageDialog(null, "o seu saldo banc�rio � de  \n  " + saldo);
		} else
			JOptionPane.showMessageDialog(null,
					"o seu Saldo continua " + saldo + "\n Seu cheque N�o pode ser descontado");
	}
}