package logica_exercicios;

import javax.swing.*;
class MultImparTres{
	public static void main(String args[]){
		int impar = 0, escape = 0;
		
		while(impar < 500){//equanto o numero for menor que 500
			if((impar % 2) == 0){//se o numero divizivel por 2 o resto for = a  0 
				impar = impar + 1;	// iremos somar o que tem no impar mais um 
				
			if((impar % 3) == 0){// se o resto da divis�o por 3 for = 0
			    escape = escape + impar;//minha variavel de escape vai somar esse numermo com ela mesma e sempre vai atribuir nela
				System.out.println(" impares multiplos de3, entre 0 e 500 = "+impar);//apenas para confirmar a impress�o dos impares								
			}
			}		
				impar ++;//vai incrementar at� 500 depois cai fora
						
		}
		JOptionPane.showMessageDialog(null,"o valor total da soma dos impares multiplos de tr�s � = "+escape); // apresenta o resultado da soma
		}
	
	}

