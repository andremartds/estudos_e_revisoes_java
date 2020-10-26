package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Nome_dinamic
{
 public static void main(String args[])
 {
  float salario;
  String nome;
  int idade;

  nome= JOptionPane.showInputDialog("Digite o seu Nome");
  idade= Integer.parseInt(JOptionPane.showInputDialog("Digite o sual idade"));
  salario= Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salario"));


  System.out.println("nome"+nome);
    System.out.println("idade"+idade);
      System.out.println("salario"+salario);
  }
}