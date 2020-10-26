package logica_exercicios;

import javax.swing.JOptionPane;
// 	REVISADA 09/09/2020
public class CAsQuatroOperacoes {
  public static void main(String args[]) {
	  float iNum1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero1"));
	  float iNum2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero2"));
      float iSoma =  iNum1 + iNum2;
      float iSub = iNum1 - iNum2;
      float iDiv = iNum1 / iNum2;
      float iMult = iNum1 * iNum2;
      JOptionPane.showMessageDialog(null,"soma = "+iSoma);
      JOptionPane.showMessageDialog(null,"sub = "+iSub);
      JOptionPane.showMessageDialog(null,"div = "+iDiv);
      JOptionPane.showMessageDialog(null,"mult = "+iMult);

 }
}