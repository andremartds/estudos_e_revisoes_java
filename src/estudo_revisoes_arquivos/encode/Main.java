package estudo_revisoes_arquivos.encode;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		Charset utf8 = StandardCharsets.UTF_8; // defino o charset
		String s1 = "13º Órgão Oficial"; // string
		byte[] bytes = s1.getBytes(utf8); // retorno os bytes em forma de um array
		String s2 = new String(bytes, utf8); // construo uma nova string passando os bytes com o charset
		System.out.println(s2); // saída
	}
}
