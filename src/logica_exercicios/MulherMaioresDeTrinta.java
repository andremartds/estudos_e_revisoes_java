package logica_exercicios;

import javax.swing.*;

class MulherMaioresDeTrinta {
	public static void main(String args[]) {
		String sexo1, sexo2, sexo3, sexo4, sexo5;
		int valor_total, idade1, idade2, idade3, idade4, idade5;
		String nome1, nome2, nome3, nome4, nome5, f;

		idade1 = 0;
		idade2 = 0;
		idade3 = 0;
		idade4 = 0;
		idade5 = 0;
		valor_total = 0;
		f = "feminino";
		nome1 = JOptionPane.showInputDialog(null, "Qual seu nome?");
		idade1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade"));
		sexo1 = JOptionPane.showInputDialog(null, "Qual seu sexo?");
		JOptionPane.showMessageDialog(null, "-Pr�ximo participante-");

		nome2 = JOptionPane.showInputDialog(null, "Qual seu nome?");
		idade2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade"));
		sexo2 = JOptionPane.showInputDialog(null, "Qual seu sexo?");
		JOptionPane.showMessageDialog(null, "-Pr�ximo participante-");

		nome3 = JOptionPane.showInputDialog(null, "Qual seu nome?");
		idade3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade"));
		sexo3 = JOptionPane.showInputDialog(null, "Qual seu sexo?");
		JOptionPane.showMessageDialog(null, "-Pr�ximo participante-");

		nome4 = JOptionPane.showInputDialog(null, "Qual seu nome?");
		idade4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade"));
		sexo4 = JOptionPane.showInputDialog(null, "Qual seu sexo?");
		JOptionPane.showMessageDialog(null, "-Pr�ximo participante-");

		nome5 = JOptionPane.showInputDialog(null, "Qual seu nome?");
		idade5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade"));
		sexo5 = JOptionPane.showInputDialog(null, "Qual seu sexo?");
		JOptionPane.showMessageDialog(null, "-Obrigado por participar-" + nome1
				+ ", " + nome2 + ", " + nome3 + ", " + nome4 + ", " + nome5);

		if ((sexo1.equals(f)) && (idade1 > 30)) {
			valor_total = valor_total + 1;
		}
		if ((sexo2.equals(f)) && (idade2 > 30)) {
			valor_total = valor_total + 1;
		}
		if ((sexo3.equals(f)) && (idade3 > 30)) {
			valor_total = valor_total + 1;
		}
		if ((sexo4.equals(f)) && (idade4 > 30)) {
			valor_total = valor_total + 1;
		}
		if ((sexo5.equals(f)) && (idade5 > 30)) {
			valor_total = valor_total + 1;
		} else
			valor_total = 0;
		JOptionPane.showMessageDialog(null,
				"O VALOR TOTAL DE MULHERES ACIMA DE 30 ANOS � =" + valor_total);
	}

}