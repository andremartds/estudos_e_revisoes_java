package oo.composicao;

public class ComidaPessoaTeste {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("André Martins", 87.0, 180.0, new Comer("Feijão", 200.00));
    p.comer();
    System.out.println(p.mostrarCaracteristicasPessoa());
  }
}
