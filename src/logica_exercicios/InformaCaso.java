package logica_exercicios;

import javax.swing.JOptionPane;

public class InformaCaso {
	public static void main(String[]args){
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu c�digo"));
		
		switch (codigo) {
		case 1:
			System.out.println("vem pra rua");
			break;
			
		case 2:
			System.out.println("vai com a Dilma");

		default:
			System.out.println("Faleceu");
			break;
		}
	}

}
