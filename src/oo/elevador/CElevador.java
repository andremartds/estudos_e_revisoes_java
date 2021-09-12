package oo.elevador;

import javax.swing.JOptionPane;

public class CElevador {
	private int iAndar;
	private int iNumeroPessoas;
	
	int getNumeroPessoas(){
		return iNumeroPessoas;
	}
	int setNumeroPessoas(int pRecebeNumeroPessoas){
		if(this.iNumeroPessoas <=20){
			return iNumeroPessoas = pRecebeNumeroPessoas;
		}else
			return iNumeroPessoas = 0;	
	}
	int getAndar(){
		return iAndar;
	}
	public void setAndar(){
		if(iAndar >=0 && iAndar <=20){
				System.out.println(iAndar);
			}else
				System.out.println("N�o exite esse andar");
		}
	public int iContaPessoas(){
		return iNumeroPessoas++;
	}
	int iSaiPessoa(){
		return iNumeroPessoas--;
	}
	public void sImprimeTudo(){
		System.out.println("o andar � = "+iAndar+" o Numero de pessoas � \n "
							);
	}
	
	
	int iChamaElevador(int pAndar){
		if(pAndar <=22){			
		return this.iAndar = pAndar;
		}else
			//pAndar = Integer.parseInt(Smsg, JOptionPane.showConfirmDialog(null,"aguarde,o elevador est� cheio "));
			return pAndar; 
	}
	int iVaiElevador(int pApertaBotaoAndar){		
		if(pApertaBotaoAndar >= 0 && pApertaBotaoAndar <= 22){
			return iAndar = pApertaBotaoAndar;
		}else
			//pApertaBotaoAndar = Integer.parseInt(Smsg,JOptionPane.showConfirmDialog(null,"elevador cheio aguarde "));
			return pApertaBotaoAndar;
	}
	void imprimeTudo(){
		JOptionPane.showConfirmDialog(null,"o numero de pessoas que tem no elevador é ");
	}


	}
