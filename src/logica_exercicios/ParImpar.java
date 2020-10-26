package logica_exercicios;
import javax.swing.JOptionPane;
class ParImpar
{
 public static void main(String args[])
 {
   String  numero =JOptionPane.showInputDialog("Digite o seu nome");
    if(numero.length() % 2 == 0) {
    	JOptionPane.showConfirmDialog(null, "Nome tem uma quntidade de letras pares");
    } else 
    	JOptionPane.showConfirmDialog(null, "Nome tem uma quntidade de letras impares");

 }
}