package arrays_e_collections.arrays.primitivo;

import java.util.Arrays;

import javax.swing.JOptionPane;
/**
 * review 10/21
 * **/
public class DesafioArrayNotas {
  public static void main(String[] args) {
    String tamanhoArray = JOptionPane.showInputDialog(null, "Digite o tamanho do array");
    int tamanhoConvertido = Integer.parseInt(tamanhoArray);
    double[] notas = new double[tamanhoConvertido];

    for (int i = 0; i < notas.length; i++) {
      notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota subsequente"));
    }
    double soma = 0.0;
    for (double nota : notas) {
      soma += nota;
    }
    System.out.println("As notas apresentas foram " + Arrays.toString(notas));
    System.out.println("A somatória das notas foram " + soma);
    System.out.println("A sua média é " + soma / notas.length);

  }
}
