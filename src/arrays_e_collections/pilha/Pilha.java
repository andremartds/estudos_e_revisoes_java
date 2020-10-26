package arrays_e_collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Rei");
		livros.add("O pequeno Man");
		livros.add("Glagui o Astro");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
	}
}
