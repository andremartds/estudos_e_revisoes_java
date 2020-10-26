package logica_exercicios;

import javax.swing.*;
class CFuncaoExemplo1 {
	public static void main(String args[]){
	retorno();
	} 
	public static void retorno(){
	int [] vet = new int[3];//obs deve se aumentar para 30 para teste usamos 10	
	for(int i=0;i<vet.length;i++){
		vet[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero: "));
	}
	for(int i=vet.length -1;i>=0;i--){
		System.out.println(vet[i]);
	}

	}
}