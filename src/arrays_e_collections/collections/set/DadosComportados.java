package arrays_e_collections.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
  Nesse exemplo criamos um Set desordenado e ordenado, atribuindo ao mesmo o seu tipo
*/
public class DadosComportados {
  public static void main(String[] args) {

    HashSet<String> conj1 = new HashSet<>();
    conj1.add("Meu primeiro dado");
    conj1.add("Meu segundo dado");
    conj1.add("Meu terceiro dado");

    System.out.println(conj1);

    for (String string : conj1) {
      System.out.println(string);
    }
    /*
     * Trabalhando com conjunto ordenado
     */
    Set<Integer> conj2 = new TreeSet<>();
    conj2.add(1);
    conj2.add(2);
    conj2.add(3);

    for (Integer integer : conj2) {
      System.out.println(integer);
    }

    // conj1.addAll(conj2); isso não pode ser feito porque são de tipos diferentes

    

  }
}
