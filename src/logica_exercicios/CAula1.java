package logica_exercicios;

import javax.swing.*;
// 	REVISADA 09/09/2020
class CAula1{
public static void main(String args[])
{	int i = 0;
	while(i<=0) {
		char cLetra = 'a';// apenas um elemento com aspas simples
		String sNome = "Sistemas de informação";//é um objeto
		byte bCodigo = 50;//pode representar até o numero 127 decimal
		short hContador=1000;//pode representar até o numero 32768
		int iQuantidade = 325678;//inteiro pode representar até 2.000.000.000 bilhoẽs
		long lNumCarros = 10034567;//inteiro que pode representar até 9 quintilões
		float fMedia = 1.8f; // com ponto flutuante
		double dResultado = 4.189;//
		boolean bLogica = true;// verdadeiro falso
		JOptionPane.showConfirmDialog(null," - "+cLetra+sNome+bCodigo+hContador+iQuantidade+lNumCarros+fMedia+dResultado+bLogica);
		i++;
		
	}
}
}