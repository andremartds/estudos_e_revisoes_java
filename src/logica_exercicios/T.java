package logica_exercicios;

import javax.swing.JOptionPane;
class T
{
 public static void main(String args[])
 {
  float le,li,ld;
  String mostre = "";

    le = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor LE"));
    li = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor LI"));
    ld = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor LD"));

  if((le <(li+ld) && li < (ld + li) && ld <(le+li)))
  {
   if      ((le == ld) && (le == li)&&(ld == li))
             mostre = "Triangulo equilatero \n tem todos lados iguais";
   else if ((li == ld) ||(li == le) || (le == ld))
            mostre = "Triangulo isoceles \n  tem dois lados iguais";
   else  // ((li == ld) && (li == le) && (le == ld))
            mostre = "triangulo equilatero todos os lados s�o diferentes";
  }
  else
  {
         mostre = "N�o � um triangulo";
  }
  JOptionPane.showMessageDialog(null,mostre);
 }

}