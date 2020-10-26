package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class CLacoDoWhile {
 public static void main(String args[]){
  String sSecebe = "";
  int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para sua multiplicado"));
  int i=1;
  do {
    sSecebe = sSecebe + "\n" + iNumero + " x " + i + " = "+(iNumero * i);
   i++;
  }while(i<=10);
    JOptionPane.showMessageDialog(null,sSecebe);
}
}