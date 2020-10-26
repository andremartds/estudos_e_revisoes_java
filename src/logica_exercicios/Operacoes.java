package logica_exercicios;

import javax.swing.*;

public class Operacoes {
     
	 public static void main(String[] args) 
	    {
	      CalculaMultiplicar();     
	         
	    }
	     @SuppressWarnings("unused")
		public static void CalculaMultiplicar()
	    {
	        int sOperacao = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Multiplicar"+"\n"+"2-Somar"+"\n"+"3-Subtrair "+"\n"+"4-Dividir "+"\n"+"5-Quadrado "+"\n"+"6-Fatorial"+"\n"+"7-Expoente"));
	        int fat= 1;
	        int iAux = 0;
	        if(sOperacao == 1)
	        {	
		        int iValor1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor"));
		        int iValor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo valor"));
	        	JOptionPane.showConfirmDialog(null,(iValor1 * iValor2)); 
	        } 
	        if(sOperacao == 2 )
	        {
		        int iValor1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor"));
		        int iValor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo valor"));
	        	JOptionPane.showConfirmDialog(null,(iValor1 + iValor1));       
	        }
	       
	        if(sOperacao == 3)
	        {	
		        int iValor1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor"));
		        int iValor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo valor"));
	            JOptionPane.showConfirmDialog(null,(iValor1 - iValor2)); 
	        }
	        if(sOperacao == 4)
	        {
		        int iValor1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor"));
		        int iValor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo valor"));
	            JOptionPane.showConfirmDialog(null,(iValor1 / iValor2)); 
	        }
	        if(sOperacao == 5)
	        {
		        int iValor1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero que \n quer multiplicar ao quadrado"));
	            JOptionPane.showConfirmDialog(null, Math.pow(iValor1, 2));
	        }
	        if(sOperacao == 6)
	        {
				int iEscape = 1;
				int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Fatorial para sua multiplicação"));
				for (int i = 1; i <= fatorial; i++) {
					iEscape = iEscape * i;
				}
				JOptionPane.showConfirmDialog(null," " + iEscape);
	        }
	        
	    }

	  }
