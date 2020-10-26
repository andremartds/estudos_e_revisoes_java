package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Prestacao
{
 public static void main(String args[])
 {
 float prestacao,valor_prest,taxa;
 int dias_atraso;
       valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da presta��o"));
       taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros"));
      dias_atraso = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias em atrazo"));

       prestacao = valor_prest + (valor_prest * (taxa / 100) * dias_atraso);

 JOptionPane.showMessageDialog(null,"\n O valor final que voce dever� pagar � \n "+prestacao);

 }
}