package oo.composicao;

public class Pessoa {
  private Comer comida;
  private String nomePessoa;
  private Double peso;
  private Double altura;
  private Double pesoAposComer;

  Pessoa(String nomePessoa, Double peso, Double altura, Comer comida) {
    this.nomePessoa = nomePessoa;
    this.peso = peso;
    this.altura = altura;
    this.comida = comida;
  }

  public Double comer() {
    return this.pesoAposComer = comida.getPesoComida() + this.peso;
  }

  public String mostrarCaracteristicasPessoa() {
    return "Nome " + nomePessoa + " - " + "Peso da comida"+ comida.getPesoComida() +  "\nPeso " + peso + " - " + "Altura " + altura + " - " + "\nPeso após comer "
        + pesoAposComer;

  }

  public Comer getComida() {
    return comida;
  }

}
