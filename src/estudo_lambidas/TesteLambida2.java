package estudo_lambidas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TesteLambida2 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("z");
		nomes.add("b"); 
		nomes.add("a"); 

		// Collections.sort(nomes, (s1, s2) ->  s1.length() - s2.length());
		
		nomes.stream().sorted()
		.map(nome -> nome.toString() )
		.forEach(nome->System.out.println(nome));

		nomes.forEach(nome -> System.out.println(nome.toUpperCase(Locale.ROOT)));

	}
}
