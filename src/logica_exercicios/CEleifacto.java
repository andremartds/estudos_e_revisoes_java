package logica_exercicios;

import javax.swing.*;
public class CEleifacto{
	public static void main(String args[]){
		int cand_A = 0, cand_B = 0, cand_C = 0, nulos = 0, condicao = 0, escape = 0, escape1 = 0, escape2 = 0, escape3 = 0;
		while(condicao != -1){				
			JOptionPane.showMessageDialog(null," ATEN��O VOTE EM APENAS UM CANDIDATO \n CASO CONTRARIO A APURA��O N�O SER� \n VERDADEIRA");
			cand_A = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja Votar no candidato A se SIM \n digite 1 Caso contrario digite 0"));
			if(cand_A !=0){
					escape = escape + cand_A;
				}
				cand_B = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja Votar no candidato B se SIM \n digite 1 Caso contrario digite 0"));
			if(cand_B !=0)
				{
					escape1 = escape1 + cand_B;
				}
				cand_C = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja Votar no candidato C se SIM \n digite 1 Caso contrario digite 0"));
			if(cand_C !=0)
				{
					escape2 = escape2 + cand_C;
				}
				nulos = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja Votar NULO se SIM \n digite 1 se n�o Digite 0"));
			if(nulos !=0)
				{
						escape3 = escape3 + nulos;
				}

			condicao--;	
			condicao = Integer.parseInt(JOptionPane.showInputDialog(null,"digite -1 para sair e ver o resultado \n ou 0 para dar lugar ao pr�ximo eleitor \n para continuar a vota��o"));
			if(condicao == -1){					
											
			if((cand_A >= cand_B)&&(cand_B >= cand_C))//se candidato a for maior que b e b maior que c logo a � maior que c
				{

						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato A  = "+escape+" \n Candidato B = "+escape1+" \n Candidato C = "+escape2+" \n Votos NULOS = "+escape3);
				}
			else if((cand_A >= cand_C)&&(cand_C >= cand_B))
				{

						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato A  = "+escape+" \n Candidato C = "+escape2+" \n Candidato B = "+escape1+" \n Votos NULOS = "+escape3);
				}
			else if((cand_B >= cand_A) &&(cand_A >= cand_C))//se candidato B for maior que a e a maior que c logo b � maior que c
				{
						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato B  = "+escape1+" \n Candidato A = "+escape+" \n Candidato C = "+escape2+" \n Votos NULOS = "+escape3);
				}
						
			else if((cand_B >= cand_C) &&(cand_C >= cand_A))
				{
						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato B  = "+escape1+" \n Candidato C = "+escape2+" \n Candidato A = "+escape+" \n Votos NULOS = "+escape3);
				}

			else if((cand_C >= cand_A) &&(cand_A >= cand_B))//se candidato c for maior que a e a maior que b logo c � maior que b
				{
						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato C  = "+escape2+" \n Candidato A = "+escape+" \n Candidato B = "+escape1+" \n Votos NULOS = "+escape3);
				}
			else if((cand_C >= cand_B) &&(cand_B >= cand_A))
				{
						JOptionPane.showMessageDialog(null,"Resultado da Vota��o por ordem \n Candidato C  = "+escape2+" \n Candidato B = "+escape1+" \n Candidato A = "+escape+" \n Votos NULOS = "+escape3);
				}				
				}
			else
			condicao = 0;
				}
	}

			
}
/*3)	Desenvolva um programa chamado eleifacto que simula
o funcionamento de uma urna eletr�nica para finalizar a vota��o o valor -1
dever� ser digitado. Ao final do programa deve apresentar por ordem de
notas os candidatos A, B e C juntamente com votos nulos.*/


