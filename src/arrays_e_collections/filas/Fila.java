package arrays_e_collections.filas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		// ambos adicionam elementos na fila
		fila.add("André"); // se cheia retorna null
		fila.offer("offer"); // se cheia lança uma exceção 
		
		// retornam o próximo elemento da fila sem remover
		System.out.println(fila.peek()); // caso não exista retorna null
		System.out.println(fila.element()); // caso não exista retorna uma exceção
		
		fila.clear(); // limpa a fila
		fila.isEmpty(); // verifica se a fila está vazia
		// 
		//obtem o próximo elemento da fila e remove
		fila.poll(); // remove da fila, caso não exista retorna null
		fila.remove(); // remove da fila, caso não exista retorna uma exceção
	}
}
