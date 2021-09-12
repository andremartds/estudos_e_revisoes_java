package oo.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		/*informa o caminho do arquivo */
		Path path = Paths.get("D:/Filles/teste.txt");
		
		/*verifica se existe o arquivo */
		System.out.println(Files.exists(path));
		
		/*verifica se o diret�rio existe */
		System.out.println(Files.isDirectory(path));
		
		/*verifica se � um execut�vel */
		System.out.println(Files.isExecutable(path));
		
		/*verifica o tamanho do arquivo */
		System.out.println(Files.size(path));
		
		/*Verifica a data da ultima opera��o */
		System.out.println(Files.getLastModifiedTime(path));
		
		/*Copia */
		/*Para se criar uma copia primeiro se cria o caminho da copia
		  depois se executa o metodo copy*/
		Path copy = Paths.get("D:/Filles/tt/copy.txt");
		Files.copy(path, copy, StandardCopyOption.REPLACE_EXISTING);
		
		/*mover arquivos */
		/*Primeiro se cria o caminho para o destino depois se cria o diretorio para
		  Destino, depois se move o arquivo passando primeiro o caminho do arquivo a
		  ser movido e depois o caminho para movelo*/
		Path dest = Paths.get("D:/Filles/tt/teste.txt");
		Files.createDirectories(dest.getParent());
		Files.move(path,dest,StandardCopyOption.REPLACE_EXISTING);
		
	}

}
