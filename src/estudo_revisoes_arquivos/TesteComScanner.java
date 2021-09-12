package estudo_revisoes_arquivos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/**
 * @author andremartds
 * Apenas de teste para leitura de um arquivo csv que montaremos uma classe, arquivo comentado
 * revisão 27-12-2020
 * */
public class TesteComScanner {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv")); //leio um arquivo com a classe scanner

		List<Conta> c = new ArrayList<>(); // crio uma lista de contas
		while (scanner.hasNextLine()) { // enquanto tiver a próxima linha
			String s = scanner.nextLine(); // pengando a próxima linha, se tiver apenas uma será ela
			Scanner linha = new Scanner(s); // novo scanner a com esse conteúdo
			linha.useDelimiter(","); // delimitador
			linha.useLocale(Locale.US); // definindo a localização
			String tipo = linha.next(); // atributo para montar objeto
			Long agencia = linha.nextLong(); // atributo para montar objeto
			Long numero = linha.nextLong(); // atributo para montar objeto
			String nome = linha.next(); // atributo para montar objeto
			Double saldo = linha.nextDouble(); // atributo para montar objeto

			c.add(new Conta(tipo, agencia, numero, nome, saldo)); // instancia do novo objeto com esses dados

			linha.close(); // fechamos para não consumir recursos
		}
		// impressão no console
		c.stream().forEach(conta -> {
			System.out.println("Tipo " + conta.getTipo() + " agencia " + conta.getAgencia() + " numero "
					+ conta.getNumero() + " Titular " + conta.getNome() + " saldo " + conta.getSaldo());
		});

	}
}
