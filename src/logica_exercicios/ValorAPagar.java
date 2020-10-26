package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo

class ValorAPagar {
	public static void main(String args[]) {
		float valor, valor_desconto, valor_pagar;
		int desconto;
		String nome;

		nome = JOptionPane.showInputDialog("Digite o seu nome");
		valor = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o valor da compra"));

		if (valor <= 200)
			desconto = 10;
		else if (valor <= 500)
			desconto = 15;
		else
			desconto = 20;

		valor_desconto = (valor * desconto) / 100;
		valor_pagar = (valor - valor_desconto);

		JOptionPane.showMessageDialog(null, "seu nome � " + nome
				+ "\n valor da compra " + valor + "\n porcentagem de desconto "
				+ desconto + "%" + "\nvalor do desconto da compra "
				+ valor_desconto + "\no valor final a pagar � " + valor_pagar);

	}
}