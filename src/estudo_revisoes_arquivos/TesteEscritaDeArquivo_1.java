package estudo_revisoes_arquivos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 * @author andremartds
 * Apenas de teste para escrita de arquivo, classe de teste comentada
 * revisão 27-12-2020
 * */
public class TesteEscritaDeArquivo_1 {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de saida de um arquivo
		OutputStream os = new FileOutputStream("file1.txt"); // nome do arquivo que será escrito
		Writer wr = new OutputStreamWriter(os); // criação de um escritor
		BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer
		
		br.write("Vamos escrever nesse novo arquivo em Java! que legal hahaha!!!"); // escrevendo
		br.newLine(); // nova linha
		br.newLine();
		br.write("Vamos escrever outra linha aqui embaixo hahaha!!!");
		br.close(); //fechando o recurso
	}
}
