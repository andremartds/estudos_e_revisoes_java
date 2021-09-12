package oo.arquivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;


public class LeituraArquivos {
	
		LeituraArquivos()
		{			
			File vrFile = null;//pega os dados do arquivo			
			FileReader vrReader = null;//abre o arquivo para leitura
			BufferedReader vrBuffer = null;//le o arquivo
			FileWriter vrEscrita = null;//escreve no arquivo
			String sLinha = "";			
			try{//tratamento de exe��es
			/*Criando os objetos de leitura*/	
			vrFile = new File(getClass().getResource("leitura.txt").toURI());
			
			/*abre arquivo para leitura*/
			vrReader = new FileReader(vrFile);
			
			 /*leitura do arquivo*/
			vrBuffer = new BufferedReader(vrReader);
			
			 /*cria��o de arquivo de saida*/
			 
			 /*Cria o objeto separador*/
			 StringTokenizer vrTokens = null;
			 
			 vrEscrita = new FileWriter("saida.txt");
			 
			//le todas as linhas do .txt
			 while((sLinha = vrBuffer.readLine()) != null){
				 
				 vrTokens = new StringTokenizer(sLinha,";");
				 vrTokens.nextToken();
				 vrTokens.nextToken();
				 int idade = Integer.parseInt(vrTokens.nextToken());
				 if(idade<25){
					 vrEscrita.write(sLinha+"\n");
				 }
			 }
			
			} catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("deu bosta...");
				System.exit(1);
			}
			finally
			{
				try
				{				
					vrReader.close();
					vrBuffer.close();
					vrEscrita.close();
				}
				catch(Exception e){
					
				}
			}
		}
	public static void main(String[] args) {
		new LeituraArquivos();
	}
}
