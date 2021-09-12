package oo.serializacaoObj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ContaBancTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*objeto */
		ContaBanc c1 = new ContaBanc("Andr�", 25.999999);
		
		
		/*camino de cria��o do arquivo de saida
		  para depois lermos ele */
		/*FileOutputStream � respons�vel por criar o caminho para armazenar a serializa��o do objeto*/
		FileOutputStream caminho = new FileOutputStream("D:/workspace/SerializacaoObjetos/objeto.ser");
		/*ObjectOutputStream � respons�vel por criar o arquivo com aquele caminho, j�s fazemoos diretor no construtor*/
		ObjectOutputStream fil = new ObjectOutputStream(caminho);
		/*escreve no arquivo caminho*/
		fil.writeObject(c1);
		/*fecha o arquivo */
		fil.close();
		
		/*Leitura do caminho do arquivo trazendo direto no construtor */
		FileInputStream leitura = new FileInputStream("D:/workspace/SerializacaoObjetos/objeto.ser");
		/*respons�vel pela leitura do arquivo do caminho */
		ObjectInputStream fill = new ObjectInputStream(leitura);
		/*atribuo a seriliza��o em um novo objeto */
		ContaBanc c2 = (ContaBanc) fill.readObject();
		/*fecho */
		fill.close();
		/*imprimo*/
		System.out.println(c2.getCliente());
		/*iprimo */
		System.out.println(c2.getSaudo());
		
		
		
	}

}
