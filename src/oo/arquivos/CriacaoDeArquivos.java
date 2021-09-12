package oo.arquivos;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CriacaoDeArquivos {
	CriacaoDeArquivos(){
		/*Para criar caminho  */
		Path caminho = Paths.get("D:/Filles/teste.txt");
		
		/*para pegar a codifica��o internacional padr�o utf-8*/
		Charset utf8 = StandardCharsets.UTF_8;
		/*Class com os metodos de escrever salvar etc no arquivo */
		BufferedWriter escreve = null;
		try{
			/*novo escritor com as caracteristicas */
			escreve = Files.newBufferedWriter(caminho, utf8);
			/*Para escrever no arquivo */
			escreve.write("texto fsad");
			/*para gravar no arquivo */
			escreve.flush();

	} catch (IOException e){
		e.printStackTrace();
	}finally{
		try {
			escreve.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
