package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class ClacoFor {
 public static void main(String args[]) {
  String recebe = "";
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para sua multiplicado"));
  for(int i=1;i<=10;i++)
    recebe = recebe + "\n" + numero + " x " + i + " = "+(numero * i);
    JOptionPane.showMessageDialog(null,recebe);
}
}