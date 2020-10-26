package logica_exercicios;

import javax.swing.JOptionPane;

public class InversorDeFraseNew {

	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("DIgite o que quer inverter");
		System.out.println(new StringBuilder(hi).reverse().toString());		
	}
}
