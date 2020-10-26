package cateristicas;

public class TipoString {
  public static void main(String[] args) {
    String nome = "André Martins";
        System.out.println(nome);
        
        nome = nome.toLowerCase(); // deixa o nome em letras minúsculas

        nome  = nome.toUpperCase(); // deixa o nome em letras maiúsculas
        
        boolean nomeEigual = nome.equals("André Martins"); // comparação
        System.out.println(nomeEigual);
        
        System.out.println(nome.charAt(1)); // encontrar uma string a partir de  um indice
      
        nome = nome.concat(" Eiiiiiiiiiiiii");   // concatenação de strings
        System.out.println(nome);

        System.out.println(nome.startsWith("And")); // verificando se existe no incio da string
        
        System.out.println(nome.endsWith("ii")); // verificando se existe no final da string
  }
}
