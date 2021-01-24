package arquivo.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;

public class CriandoArquivoProperties {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("nome", "Andre Martins");
		p.setProperty("login", "andremartinsdsilva@gmail.com");
		
		p.store(new FileWriter("conf.properties"),null);
		
		
		Properties pLeitura = new Properties();
		pLeitura.load(new FileReader("conf.properties"));
		
		String nome = pLeitura.getProperty("nome");
		String login = pLeitura.getProperty("login");
		System.out.printf("Nome da pessoa %s, login para pessoa %s",nome, login);
		
		
	}
}
