package arrays_e_collections.matrizes;

import java.util.Scanner;

public class Matriz_Exemplo_01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // utilizamos o scanner para entrada de dados
    System.out.print("Qual a quantidade de alunos: "); // mensagem para entrada de dados
    int qtdAlunos = entrada.nextInt(); // atribuição

    System.out.print("Qual a quantidade de notas de cada aluno: "); // mensagem para entrada de dados
    int qtdNotas = entrada.nextInt(); // atribuição

    double notas[][] = new double[qtdAlunos][qtdNotas]; // definimos a matriz baseada nos valores atribuidos pelo usuario
    double totalNotas = 0; // acumulador
    /*
    * percorremos o array de cada aluno até o fim de sua nota
    */
    for (int alunos = 0; alunos < notas.length; alunos++) {
      for (int qtdN = 0; qtdN < notas[alunos].length; qtdN++) {
        System.out.println("Agora informe a nota do aluno " + (alunos + 1) + " sua " + (qtdN + 1) + " nota");
        notas[alunos][qtdN] = entrada.nextDouble(); // atribuimos ao aluno[indiceAluno][notaEmQuestao]
        totalNotas += notas[alunos][qtdN]; // somamos
      }
    }
    System.out.println("Total Somado " + totalNotas);
    entrada.close();
  }
}
