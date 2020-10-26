package logica_exercicios;

import javax.swing.JOptionPane;

public class Estudar {
	public static void main(String[] args) {
		String estudar;
		estudar = JOptionPane.showInputDialog(null, "Digita ai");
		if (estudar.equalsIgnoreCase("")) {
			System.out.println("futuro inserto");
		} else
			System.out.println("Futuro com mais chances");
	}
}
