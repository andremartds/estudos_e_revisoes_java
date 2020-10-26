package busca_sequencial;

import java.util.ArrayList;

public class BuscaSequencial {
  int indiceInicial;
  int indiceFinal;
  int posicaoAtual;
  int meio;

  // condição
  boolean achou = false;

  int indice = 0;

  ArrayList<Pessoa> vrPessoas = new ArrayList<Pessoa>();

  public void posicaoClientes(String nome) {
    while (!achou) {

      for (int i = 0; i < vrPessoas.size(); i++) {

        if (vrPessoas.get(indice).getNome().equalsIgnoreCase(nome)) {
          System.out.println(vrPessoas.get(indice).getNome() + " está na posição \n" + indice);
          indice++;

        } else {
          indice = indice + 1;

        }
        if(indice > vrPessoas.size()) {
          achou = true;
        }

      }
      achou = true;
    }
  }

  public void posicaoClientes(String sNome, int indI, int indF) {
    this.indiceInicial = indI;
    this.indiceFinal = indF;
    posicaoAtual = (indiceInicial + indiceFinal) / 2;

    for (int j = 0; j < posicaoAtual; j++) {
      if (vrPessoas.get(j).getNome().equalsIgnoreCase(sNome)) {
        System.out.println(j);
      } else {
        for (int i = 0; i < posicaoAtual; i++) {
          if (vrPessoas.get(i).getNome().equalsIgnoreCase(sNome)) {
            System.out.println(i);
          }
        }
      }

    }
  }
}
