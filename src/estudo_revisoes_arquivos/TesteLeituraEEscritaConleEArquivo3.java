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
 * Leitura de arquivos com java
 * */
public class TesteLeituraEEscritaConleEArquivo3 {
	public static void main(String[] args) throws IOException {

		InputStream fis = System.in; // recupero o arquivo de forma binária
		Reader isr = new InputStreamReader(fis); // recupero da forma de bytes
		BufferedReader br = new BufferedReader(isr); // adiciono a um leitor de buffer


		OutputStream os = System.out; // nome do arquivo que será escrito
		Writer wr = new OutputStreamWriter(os); // criação de um escritor
		BufferedWriter bw = new BufferedWriter(wr); // adiciono a um escritor de buffer

		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // joga de fato no terminal antes do boffer ser fechado
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
