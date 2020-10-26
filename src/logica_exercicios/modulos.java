package logica_exercicios;

import javax.swing.*;
class modulos
{
	public static void main(String args[])
	{
	int iResposta = 0;
	int iValor1 =0;
	int iValor2 =0;
	while(iResposta!=5)
	{
		MotraMenu();
		iResposta = leValor();
		iValor1 = leValor1();
		iValor2 = leValor1();
		System.out.println(realizaOperacao(iResposta, iValor1, iValor2));
		
		iResposta = 5;
	}
	}
	static int realizaOperacao(int pCodOp, int pVal1, int pVal2)//passei os pararametros que ir�o receber o que meu System do main passou
	{
		if(pCodOp ==1){
			return (pVal1 + pVal2);
		}
		
		else if(pCodOp ==2){
			return (pVal1 - pVal2);
		}
		
		else if(pCodOp ==3){
			return (pVal1 * pVal2);
		}
		
		else if(pCodOp ==4){
			return (pVal1 / pVal2);
		}
		
		else if(pCodOp == 5){
			return 0 ;
		}
		
		return 0;
		
	}
	public static int leValor()	{
		return Integer.parseInt(JOptionPane.showInputDialog("Digite a opera��o \n 1 - somar \n 2 - subtrair \n 3 - multiplicar\n 4 - dividir \n 5 - ao final - sair"));
	}
	
	public static int leValor1() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros para a opera��o"));		
	}
	
	public static void MotraMenu() {
		JOptionPane.showMessageDialog(null,"Digite a opera��o \n 1 - somar \n 2 - subtrair \n 3 - multiplicar\n 4 - dividir \n 5 - ao final - sair");		
	}
}