package logica_exercicios;

import javax.swing.JOptionPane;

// 	REVISADA 09/09/2020

class Vendas2 {
	public static void main(String args[]) {
		float fixo, softwar_vendidos, bonus, salario_total;

		fixo = 500;

		softwar_vendidos = Float
				.parseFloat(JOptionPane
						.showInputDialog("Digite a quantidade de software que voce vedeu"));

		bonus = softwar_vendidos * 50;
		salario_total = bonus + fixo;

		JOptionPane.showMessageDialog(null, "\nO seu salario e  \n " + fixo
				+ "\nO o seu bonus e  \n " + bonus
				+ "\n  o seu salario total é " + salario_total + " R$");

	}
}