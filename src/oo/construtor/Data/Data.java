package oo.construtor.Data;

public class Data {
  String dia;
  String mes;
  String ano;

  Data() {
    this.dia = "10";
    this.mes = "Janeiro";
    this.ano = "1970";
  }

  Data(String dia, String mes, String ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
}
