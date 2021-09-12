package estudo_revisoes_arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 * @author andremartds
 * Apenas de teste para leitura de arquivo, classe de teste comentada
 * revisão 27-12-2020
 * */
public class TesteLeituraDeArquivo_01 {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de um arquivo
		InputStream fis = new FileInputStream("file.txt"); // recupero o arquivo de forma binária
		Reader isr = new InputStreamReader(fis); // recupero em forma de bytes
		BufferedReader br = new BufferedReader(isr); // adiciono a um leitor de buffer
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine(); //pega a próxima linha
		}
		
		br.close(); // fechando o recurso
	}
}
