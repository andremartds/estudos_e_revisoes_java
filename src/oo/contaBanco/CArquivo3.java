package oo.contaBanco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CArquivo3 {
	
	@SuppressWarnings("unused")
	public static void guardaContas(ArrayList<CContaDeBanco> contas) throws IOException{		
		/* Crie o caminho */
		Path armazena = Paths.get("D:/Files/arquivo.txt");
		/* Criei o diret�rio */
		Files.createDirectories(armazena.getParent());
		/* Criei o Conteudo do arquivo */
		
		for (CContaDeBanco cam : contas) {
			//writer.(cam.getCliente());
		}
		
		/*como gravar o conteudo do array*/
	//	byte[] criar = c.getBytes();
		
		/* crio o meu arquivo limpo e escrevo */
		//Files.write(armazena, criar);
	}

	public static void main(String[] args) throws IOException {
		ArrayList<CContaDeBanco> contas = new ArrayList<CContaDeBanco>();
		contas.add(new CContaDeBanco("pedro"));
		contas.add(new CContaDeBanco("pedro"));
		contas.add(new CContaDeBanco("Rafael"));
		contas.add(new CContaDeBanco("Manoel"));
		contas.add(new CContaDeBanco("Ad�o"));
		contas.add(new CContaDeBanco("Aline"));
	}

}
