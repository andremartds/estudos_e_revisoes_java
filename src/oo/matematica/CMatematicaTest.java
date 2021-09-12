package oo.matematica;

import javax.swing.JOptionPane;

public class CMatematicaTest {

	/**
	 * @param args
	 * Andr� Martins
	 */
	public static void main(String[] args) {
		/*CMatematica matematica = new CMatematica();
		int iScap = matematica.iSoma(30, 20);
		System.out.println(iScap);
		
		double iArmaz = matematica.dCompara(4, 2);
		double iScap1 = matematica.dCompara(3, 5);
		System.out.println(iArmaz + iScap1);*/
		int iRaizN =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Numero para sua Raiz"));
		CMatematica matematica = new CMatematica();
		int test = matematica.iRaiz(iRaizN);// insira sua raiz aqui
		JOptionPane.showConfirmDialog(null,"A Raiz quadrada de "+iRaizN+" � =  "+test);
		
		System.out.println(matematica.media(50,40));
		System.out.println(matematica.media(50,40,20,80,90));
		System.out.println(matematica.media("50","40"));
		
	}

}
