package serializacao_objetos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoEscrita {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String s = "Andre Martins";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.bin"));
		oos.writeObject(s);
		oos.close();
	}
}
