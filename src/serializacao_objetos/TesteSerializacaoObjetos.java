package serializacao_objetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setIdade(32);
//		pessoa.setNome("Bia");
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.bin"));
//		oos.writeObject(pessoa);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.bin"));
		Pessoa pessoa = (Pessoa) ois.readObject();
		
		System.out.println(pessoa.getNome());
		
		
	}
}
