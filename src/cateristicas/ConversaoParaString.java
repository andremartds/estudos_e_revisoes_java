package cateristicas;

public class ConversaoParaString {
  public static void main(String[] args) {
    Integer num = 123456;
    System.out.println(num.toString());

    System.out.println(Integer.toString(num));

    // terceira forma e pouco usada "FEIA"
    System.out.println("" + num);
  }
}
