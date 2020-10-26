package logica_exercicios;

import javax.swing.*;

class CLerNotaComFor {
	public static void main(String args[]) {
		float nota, calc_media = 0, soma_notas = 0;// ciei as vari�veis
		int i;

		for (i = 1; i <= 3; i++) {
			nota = Float.parseFloat(JOptionPane.showInputDialog(null,
					"Digite a " + i + "� nota de 0 a 10 "));
			if ((nota >= 0) && (nota <= 10)) {
				soma_notas = soma_notas + nota;
			} else {
				JOptionPane.showMessageDialog(null,
						"Nota inv�lida Digite uma nota de 0 a 10");
				i = i - 1;
			}
		}
		calc_media = soma_notas / 3;
		JOptionPane.showMessageDialog(null, "A m�dia geral das notas � "
				+ calc_media);
		
		if(calc_media >= 6){
			System.out.println("Aprovado");
		} else if ((calc_media < 6) && (calc_media >=4)){
			System.out.println("Recupera��o");
		} else if (calc_media < 4){
			System.out.println("Reprovado");
		} else
			System.out.println("Aprovado com boa media");
	}
}