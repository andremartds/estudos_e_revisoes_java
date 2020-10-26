package logica_exercicios;
import java.util.ArrayList;

public class BuscaBinaria 
{
	public static void main(String args[])
	{
		ArrayList<String> vetClientes = new ArrayList<String>();
		
		vetClientes.add("Ana");
		vetClientes.add("Beto");
		vetClientes.add("Carlos");
		vetClientes.add("Diana");
		vetClientes.add("Fernando");
		vetClientes.add("Giulia");
		vetClientes.add("Heitor");
		vetClientes.add("Irian");
		vetClientes.add("Leonardo");
		vetClientes.add("Marcia");
		vetClientes.add("Nubia");
		vetClientes.add("Roberto");
		vetClientes.add("Pedro");
		vetClientes.add("Rose");
		vetClientes.add("Tati");
		vetClientes.add("Valesca");
		
		//Chama a funcao recursiva e imprime na tela o resultado
		System.out.print(posicaoCliente(vetClientes, "Valesca", 0, vetClientes.size()-1));
	}
	
	static int posicaoCliente(ArrayList<String> vetNomes, String sNome, int lInf, int lSup)
	{
		//Calcula o indice do elemento atual com base nos limites superior e inferior
		int iPosAtual = (lInf + lSup) / 2;
		
		//Verifica se o nome foi encontrado
		if (vetNomes.get(iPosAtual).equals(sNome))
		{
			return iPosAtual;
		}
		
		//Nao ha mais o que buscar
		if (lInf > lSup)
		{
			return -1;
		}
		
		//Redefine a subconjunto de busca para a metade superior senao busca na metade inferior
		if (sNome.compareTo(vetNomes.get(iPosAtual)) > 0)
		{
			return posicaoCliente(vetNomes, sNome, iPosAtual+1, lSup);
		}
		else
		{
			return posicaoCliente(vetNomes, sNome, lInf, iPosAtual-1);
		}
	}
}
