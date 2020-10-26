package cateristicas;

public class TiposPrimitivos {
  public static void main(String[] args) {

    byte numerobyte = 127; // de -128 a 127
    System.out.println(numerobyte);

    short numeroShort = 32767; // de -32768 32767
    System.out.println(numeroShort);

    int numeroInt = 2147483647; // -2.147.483.648 2.147.483.647
    System.out.println(numeroInt);

    long numeroLong = 922337203; // -9.223.372.036.854.770.000 9223.372.036.854.770.000
    System.out.println(numeroLong);

    float numeroFloat = 340282347F; // 1.4024E-37 3.40282347E + 38
    System.out.println(numeroFloat);

    double numeroDouble = 6.65D; // -4.94E-307 1. ... E + 38
    System.out.println(numeroDouble);

    boolean condicao = true; // alto declarativo
    condicao = false;

    char a = 'a';
    System.out.println(a);
  }
}
