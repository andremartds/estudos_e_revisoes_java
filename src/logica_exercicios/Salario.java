package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Salario
{
 public static void main(String args[])
 {
  float fixo,comissao,vendas_mes,salario_total;

   fixo = 800;

    vendas_mes = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto voce vendeu neste mes"));

    comissao = (vendas_mes * 15)/100;
    salario_total = fixo + comissao;
  JOptionPane.showMessageDialog(null,"\nO seu salario e  \n "+fixo+
                                     "\nO com suas comiss�es e  \n "+salario_total+
                                     "\n  voc� teve de comiss�o " +comissao+" R$");

 }
}