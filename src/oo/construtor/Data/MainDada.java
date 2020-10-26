package oo.construtor.Data;

public class MainDada {
  public static void main(String[] args) {
    Data data = new Data();
    System.out.println(data.dia + "/" + data.mes + "/" + data.ano);

    Data data2 = new Data("10","Janeiro","1988");
    System.out.println(data2.dia + "/" + data2.mes + "/" + data2.ano);
  }
}
