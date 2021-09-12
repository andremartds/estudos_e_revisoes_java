package oo.arquivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeEscreveContaTest {
/*Problema se deve gravar as contas de banco em um txt depois deve se ler
 * e depois trazelo como leitura do programa */
	public static void main(String[] args) {
		ArrayList<ContaBanc> nConta = new ArrayList<>();
		
		nConta.add(new ContaBanc("Pedro",333.33));
		nConta.add(new ContaBanc("Alberto",222.222));
		nConta.add(new ContaBanc("Natalia",111.1));
		nConta.add(new ContaBanc("Jos�",1111.111));
		nConta.add(new ContaBanc("Roberto",133.5));
		nConta.add(new ContaBanc("Andrade",1.566));
		nConta.add(new ContaBanc("Pisson",11.566));
		nConta.add(new ContaBanc("Roberto",14.566));
		nConta.add(new ContaBanc("Mirian",13.566));
		
		Path path = Paths.get("D:/Filles/contasDeBanco.txt");
		
		Charset utf8 = StandardCharsets.UTF_8;
		
		BufferedWriter w = null;
		
		try{
			w = Files.newBufferedWriter(path,utf8);
			for (int i = 0; i < nConta.size(); i++) {
					w.write(nConta.get(i).getCliente());
					w.write(String.valueOf(nConta.get(i).getSaudo()));
					w.flush();
			}

		}catch(IOException e){
			e.printStackTrace();			
		}finally{
			try {
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		BufferedReader r = null;
		String linhaLida = "";
		try{
			r=Files.newBufferedReader(path, utf8);
			while((linhaLida = r.readLine())!=null){
				System.out.println(linhaLida);
			}		
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
