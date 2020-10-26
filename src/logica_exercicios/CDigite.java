package logica_exercicios;

import javax.swing.*;

import java.util.*;

public class CDigite {
	public static void main(String[] args) {
		String[] vVetor = new String[6];
		for (int iIndice = 0; iIndice <= vVetor.length; iIndice++) {
			vVetor[iIndice] = new Scanner(System.in).nextLine();
			JOptionPane.showMessageDialog(null, vVetor[iIndice]);
		}
		
	}

}
