package arrays_e_collections.collections.set;

import java.util.HashSet;

/*
  * Conjuntos/Set em java são gerelmente definidos para se termos dados Homogêneos
  * No exemplo abaixo definimos um conjunto heterogêneo (Forma errada)
*/

public class DadosBaguncados {
  public static void main(String[] args) {
    /*
     * Para criar um conjunto podemos instanciar a partir da classe HashSet
     */
    HashSet conjunto = new HashSet();

    /*
     * Para adicicionarmos ao conjunto podemos utilizado o metodo add, podemos
     * adicionar qualquer tipo de dado. Qualquer tipo primitivo adicionado ao
     * conjunto será convertido para o seu correlacinado Objeto
     */

    conjunto.add(3);
    conjunto.add("Outro dado parao conjunto");
    conjunto.add(true);

    System.out.println(conjunto); // Imprimimos o conjunto

    System.out.println(conjunto.size()); // retorna o tamanho do cojunto

    conjunto.remove(3); // removemos um dado/tipo do conjunto

    System.out.println(conjunto);

    /*
     * Em conjunto não podemos adicionar dados/tipos iguais, ele simplesmente vai
     * ignorar o dado repetido
     */

    conjunto.add("Outro dado parao conjunto");
    System.out.println(conjunto);

    /*
     * Para se fazer a união entre dois conjuntos podemos fazer o seguinte
     */
    HashSet novoConjunto = new HashSet();
    novoConjunto.add(3);
    novoConjunto.add(false);
    novoConjunto.add("Outro dado parao conjunto");

    /*
     * é interessante notar que mesmo assim os dados não serão repetidos no conjunto
     */

    conjunto.addAll(novoConjunto);

    System.out.println(conjunto);
    /*
      Para fazermos a interseção entre os conjuntos podemos fazer o seguinte
    */
    HashSet c3 = new HashSet();
    HashSet c4 = new HashSet();

    c3.add(3);
    c3.add(false);
    c3.add("Outro dado");

    c4.add(3);
    c4.add(true);
    c4.add("Outro dado");
    c3.retainAll(c4);

    System.out.println(c3);

  }
}
