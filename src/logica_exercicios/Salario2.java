package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Salario2
{
 public static void main(String args[])
 {
 float sal_liquido,sal_bruto,inss;
  String nome;
   nome = JOptionPane.showInputDialog("Digite o nome");
    sal_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario bruto"));
     inss = (sal_bruto * 9) / 100;
      sal_liquido = sal_bruto - inss;
       JOptionPane.showMessageDialog(null,"\nO O nome do fucionario �  \n "+nome+
                                     "\nO Seu salario bruto �  \n "+sal_bruto+ "     R$"+
                                     "\nO O desconto do inss � \n "+inss+ "          R$"+
                                     "\n  O seu salario liquido � " +sal_liquido+"   R$");


 }
}