package estudo_revisoes_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author andremartds
 * Apenas de teste para escrita de arquivo, classe de teste comentada
 * revisão 27-12-2020
 * */
public class TesteEscritaDeArquivo_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter br = new BufferedWriter(new FileWriter("file2")); // criando o arquivo para escrita
		
		br.write("Vamos escrever nesse novo arquivo em Java em! que legal hahaha!!!"); // escrevendo
		br.newLine(); // nova linha
		br.newLine();
		br.write("Vamos escrever outra linha aqui embaixo hahaha!!!");
		br.close(); // fechamos o recurso
	}
}
