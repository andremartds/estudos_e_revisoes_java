package arrays_e_collections.arrays.primitivo;

import java.util.Arrays;

public class __01__ArrayDefinicao {
  public static void main(String[] args) {
    int[] a = new int[8];
    a[2] = 10;
    System.out.println(a[2]);

    double notas[] = new double[3];
    notas[0] = 8.0;
    notas[1] = 7.3;
    notas[2] = 2.3;
    double totalNotas = 0;
    for (int i = 0; i < notas.length; i++) {
      totalNotas += notas[i];
      System.out.println("notas impressas " + notas[i]);
    }

    System.out.println("Média " + totalNotas / 3);

    int novoArray[] = new int[2];
    novoArray[0] = 2;
    novoArray[1] = 4;
    System.out.println(Arrays.toString(novoArray));

  }
}
