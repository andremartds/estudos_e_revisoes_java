package oo.composicao;

public class Comer {
  
  public String nomeComida;
  public Double pesoComida;

  Comer() {}
  public Comer(String nomeComida, Double pesoComida) {
    this.nomeComida = nomeComida;
    this.pesoComida = pesoComida;
  }

  public String getNomeComida() {
    return nomeComida;
  }
  public Double getPesoComida() {
    return pesoComida;
  }
  public void setNomeComida(String nomeComida) {
    this.nomeComida = nomeComida;
  }
  public void setPesoComida(Double pesoComida) {
    this.pesoComida = pesoComida;
  }


}
