package arrays_e_collections.collections.list;

import java.util.ArrayList;
import java.util.List;
/*
  * As listas podem ter valores duplicados
  * podemos acessar um indice da lista
  * podemos remover determinado indice
  * podemos verificar se contem determinado indice
*/
/**
 * review 10/21
 * **/
public class TestePessoa {
	public static void main(String[] args) {
		List<Pessoa> p = new ArrayList<>();
		
		p.add(new Pessoa("Maria"));
		System.out.println(p.get(0).nome);
		
		System.out.println(p.contains(new Pessoa("Maria")));
		
		Pessoa p2 = new Pessoa("Marta");
		p.add(p2);
		
		for (Pessoa pessoa : p) {
			System.out.println(pessoa.nome);
		}
	}
}
