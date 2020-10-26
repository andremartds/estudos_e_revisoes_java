package logica_exercicios;

import javax.swing.JOptionPane;

// 	REVISADA 09/09/2020
public class AnoBissexto {

	public static void main(String[] args) {
		Integer condicao = Integer.parseInt(JOptionPane.showInputDialog(null, "qual a condicao"));
		Integer anoParaComecar = Integer.parseInt(JOptionPane.showInputDialog(null, "qual a condicao"));

		for (int i = 0; i < condicao; i++) {
			if (anoParaComecar % 4 == 0 && anoParaComecar % 100 != 0 || anoParaComecar % 400 == 0) {
				System.out.print(anoParaComecar + " é bissexto\n");
				anoParaComecar++;
			} else {
				System.out.println(anoParaComecar + " Não é bissexto\n");
				anoParaComecar++;
			}
		}
	}
}
