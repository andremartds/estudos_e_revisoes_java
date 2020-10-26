package logica_exercicios;

import javax.swing.*;
class Poupanca
{
	public static void main(String args[])
	{
		saldoBanco();
	}
	public static void saldoBanco()
	{
	
	float fDeposito=0f, fEscape1= 0f, fEscape = 0f;
	fDeposito = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do seu deposito"));
	JOptionPane.showMessageDialog(null," O seu rendimento mensal � de 0.70 ");
	fEscape1 = fDeposito;	
	fEscape = ((fDeposito * 0.70f) / 100f);
	fEscape =  fEscape + fEscape1;
	
	JOptionPane.showMessageDialog(null, "voc� tinha na sua conta" +fDeposito+ "\n agora voc� tem" + fEscape);
	
	}
}