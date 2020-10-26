package logica_exercicios;

import javax.swing.*;

class NumeroInvert {
	public static void main(String args[]) {
		int[] iVet = new int[4];
		for (int i = 0; i < iVet.length; i++) {
			iVet[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe o numero: "));
		}
		/*meu i sempre ser� igual ao vetor menos 1 enquanto ele n�o chegar
		 * a zero ele vai decrementando.... por exemplo digito 1 e 2 ele vai pegar a
		 * ultima posi��o do indice menos 1 posi��o no caso ficaria o numero 1 como posi��o
		 * depois ele faria a mesma coisa com o segundo indice dessa forma ele inverteria os 
		 * valores*/
		for(int i = iVet.length - 1; i >= 0; i--) {
			System.out.println(iVet[i]);
		}
	}

}
