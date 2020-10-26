package logica_exercicios;

import java.util.*;
import javax.swing.*;

public class CDesafioDosDados {
	public static void main(String[] args) {
		int entradaUsuario;
		while (true) {
			entradaUsuario = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Jogue o dado de 1 a 6 Vamos ver se Você acerta"));
			if (entradaUsuario <= 6 && entradaUsuario > -1 && entradaUsuario != 0) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Digite um numero entre 1 e 6");
			}
		}
		int[] arrayDados = new int[6];
		arrayDados[0] = 1;
		arrayDados[1] = 2;
		arrayDados[2] = 3;
		arrayDados[3] = 4;
		arrayDados[4] = 5;
		arrayDados[5] = 6;
		Random aleatorio = new Random();
		int aux = aleatorio.nextInt(arrayDados.length);
		int numeroAtribuido = arrayDados[aux];

		JOptionPane.showConfirmDialog(null, "O seu Palpite foi " + entradaUsuario);
		
		JOptionPane.showConfirmDialog(null, "O numero do dado jogado foi " + numeroAtribuido);
		
		if (entradaUsuario == numeroAtribuido) {
			JOptionPane.showConfirmDialog(null, " Parabens você ganhou ");
		} else {
			JOptionPane.showConfirmDialog(null, " Game over ");
		}

	}
}
