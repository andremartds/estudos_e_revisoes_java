package estudo_revisoes_arquivos;

import java.io.IOException;
import java.io.PrintStream;
/**
 * @author andremartds
 * Apenas de teste para escrita de arquivo, classe de teste comentada
 * revisão 27-12-2020
 * */
public class TesteEscritaDeArquivo_3 {
	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("file3.txt"); // criando o arquivo

		ps.print("Vamos escrever nesse novo arquivo em Java em! que legal hahaha!!!"); // escrevendo
		ps.println(); // nova linha
		ps.println();
		ps.print("Vamos escrever outra linha aqui embaixo hahaha!!!");
		ps.close(); // fechando o rescurso
	}
}
