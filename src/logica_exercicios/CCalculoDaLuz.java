package logica_exercicios;

import javax.swing.*;
class CCalculoDaLuz {
	public static void main(String args[]) {
		float scape = 0f;
		String luz=JOptionPane.showInputDialog(null,"Digite o tipo de consumo \n r para resid�ncia \n c para Comercio \n i para Industria");
		int iValor =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu consumo KW/h"));
		if(luz.equals("c")||(luz.equals("C"))){
			scape = iValor * 0.60f;		
			JOptionPane.showMessageDialog(null,"O valor da conta é = "+scape);
		}else if(luz.equals("r")||luz.equals("R")){
			scape = iValor * 0.48f;		
			JOptionPane.showMessageDialog(null,"O valor da conta é = "+scape);
		}else if(luz.equals("i")||luz.equals("I")){
			scape = iValor * 1.29f;		
			JOptionPane.showMessageDialog(null,"O valor da conta é = "+scape);
	}
	}
}