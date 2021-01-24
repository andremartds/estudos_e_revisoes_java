package serializacao_objetos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader;

public class TesteSerializacaoLeitura {

	public static void main(String[] args) throws IOException, EOFException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
	}
}
