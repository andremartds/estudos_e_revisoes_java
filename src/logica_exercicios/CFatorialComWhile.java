package logica_exercicios;
import javax.swing.*;
class CFatorialComWhile{
	public static void main(String args[]){
		long escape = 1, armazena_fatorial =0;//variaveis conseguem armazenar grandes valores tipo long 
			 long iNumeroFatorial = Long.parseLong(JOptionPane.showInputDialog("Digite o numero Fatorial para sua multiplica��o"));//numero fatorial
			 armazena_fatorial = iNumeroFatorial; //armazeno esse numero em outra variavel
			if(iNumeroFatorial == 0){//se o numero for zero
				JOptionPane.showMessageDialog(null,"O fatorial de Zero � 1 "); //n�o pode haver fatorial de zero
			}
			else{//se n�o
			while(iNumeroFatorial >= 1){//enquanto ele for maior ou = a 1
			
				escape = escape * iNumeroFatorial;//vou multiplicar ele por minha variavel de escape
				//essa variavel de escape amazena o resultado da multiplica��o do fatorial
				iNumeroFatorial--;//vou decrementando at� que o numeto chegue a 1
			}
			JOptionPane.showMessageDialog(null,"o resultado do numeto fatorial "+armazena_fatorial+" � = "+escape);//imprimo na tela
	}
	}
}