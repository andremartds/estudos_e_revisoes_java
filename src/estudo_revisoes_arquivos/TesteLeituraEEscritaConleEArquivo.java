package estudo_revisoes_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
/**
 * @author andremartds
 * Apenas de teste para leitura de um arquivo, classe de teste comentada
 * revisão 27-12-2020
 * */
public class TesteLeituraEEscritaConleEArquivo {
	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("file.txt"); // recupero o arquivo de forma binária
		Reader isr = new InputStreamReader(fis); // recupero em forma de bytes
		BufferedReader br = new BufferedReader(isr); // adiciono a um leitor para o buffer


		OutputStream os = new FileOutputStream("file1.txt"); // nome do arquivo que será escrito
		Writer wr = new OutputStreamWriter(os); // criação de um escritor
		BufferedWriter bw = new BufferedWriter(wr); // adiciono a um escritor de buffer

		String linha = br.readLine();
		
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close(); // fechando recurso
		bw.close(); // fechando recurso
	}
}
