package cateristicas.strings;

public class TesteString {

	public static void main(String[] args) {
		String nome = "O que é";

		System.out.println(nome.toUpperCase()); // converte em letras maiúsculas

		System.out.println(nome.toLowerCase()); // converte em letras minúsculas

		System.out.println(nome.charAt(2)); // pega o caractére no indice 2

		System.out.println(nome.indexOf("é"));

		System.out.println(nome.compareTo("O que")); // retorna a quantidade de caracteres de diferentes

		String frase = "sopapos";
		String add="";
		for (int i = frase.length()-1; i >= 0; i--) {
			add = add.concat(""+frase.charAt(i));
		}
		System.out.println(add.equals(frase));

	}

}
