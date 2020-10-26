package logica_exercicios;
import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
class Teste
{
 public static void main(String args[])
 {
  float prova1, prova2, prova3, media;

    prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
     prova2  = Float.parseFloat(JOptionPane.showInputDialog("Digite a segnda nota"));
       prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));


  prova1 = prova1 * 2 / 10;
  prova2 = prova2 * 3 / 10;
  prova3 = prova3 * 5 / 10;

  media = prova1 + prova2 + prova3;

if(media >= 6)
		JOptionPane.showMessageDialog(null, "null, Escolha uma opcao", null, 1);
  else if(media >=4)
         JOptionPane.showMessageDialog(null, "sua media � = "+media+" voce esta de recupera��o");
  else
       JOptionPane.showMessageDialog(null, "voc� foi reprovado"+media);

 }
}