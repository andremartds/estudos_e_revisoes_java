package estudo_lambidas;

import java.util.*;

public class TesteListas {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Pedro");
		nomes.add("Bia Martins");
		nomes.add("André Martins");
		
		for (String string : nomes) {
			System.out.println(string);
		}
		System.out.println("#####################################################");
		Collections.shuffle(nomes); // embaralhar
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
		System.out.println("#####################################################");
		Collections.reverse(nomes); // reverter
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
		System.out.println("#####################################################");
		Collections.rotate(nomes,1); // rotacionar
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
		
	}
}
