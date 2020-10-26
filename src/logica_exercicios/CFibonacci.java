package logica_exercicios;

import javax.swing.JOptionPane;

/*
 * Como construir, primeiro fa�a um array de inteiro, fa�a um la�o for com a condi��o para i = 0 execute i menor que o final do array
 * i vai imcrementar
 * a condicao sera para sempre somar o resultado da soma com o resultado da soma anterior ex: 1+2 = 3 depois vai somar 2+3 = 5 depois vai somar
 * 3+5 = 8 depois vai somar 5+8 assim por diante
 */
public class CFibonacci {
	public static void main(final String[] args) {
		Integer i = Integer.valueOf((JOptionPane.showInputDialog("digite o numero para calcular o fibonacci")));
		int iAnterior = 1;
		int iProximo = 2;
		System.out.println(iAnterior);
		System.out.println(iProximo);
		while (iProximo <= i) {
			iProximo = iProximo + iAnterior;// somo o proximo numero com o
											// anterior
			iAnterior = iProximo - iAnterior;// subtraio do proximo o anterior e
												// atribuo o numero ao anterior
			System.out.println(iProximo);// imprimo

		}
	}
}
