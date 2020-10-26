package logica_exercicios;

import javax.swing.JOptionPane;
/*
 * Autor Andr� Martins
 */
public class CConsorcio {
	public static void main(String args[]){
		 float fValorPrestacao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da presta��o"));
	     int iTotalPretacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de presta��es"));
	     float fQuantPretacaoPagas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de presta��es pagas"));
	     float fTotalPago = (fValorPrestacao * fQuantPretacaoPagas);
	     float fSaldoDevedor = fValorPrestacao * (iTotalPretacao - fQuantPretacaoPagas);
	     JOptionPane.showMessageDialog(null,"\n O valor da presta��o � \n "+fValorPrestacao+
	                                          "\n O total de presta��es � \n = "+iTotalPretacao+ 
	                                          "\n A quantidade de presta��es pagas � \n = "+fQuantPretacaoPagas+
	                                          "\n  O total pago � " +fTotalPago+" R$"+
	                                          "\n  O saldo devedor � " +fSaldoDevedor+" R$");
 }
}