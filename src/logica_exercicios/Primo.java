package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Primo
{
 public static void main(String args[])
 {
   int numero,contador,i;

      i = 2;
      contador = 0;

      numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite o numero "));

    while(i < numero)
   {
    if (numero % i == 0)
        contador++;
        i++;
    }
    if (contador > 0)
    JOptionPane.showMessageDialog(null,"nao � primo "+numero);
    else
    JOptionPane.showMessageDialog(null,"� primo "+numero);
}
}