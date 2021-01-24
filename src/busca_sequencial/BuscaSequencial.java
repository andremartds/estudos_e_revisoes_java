package busca_sequencial;

import java.util.ArrayList;

public class BuscaSequencial {
	int indiceInicial;
	int indiceFinal;
	int posicaoAtual;
	int meio;

	// condição
	boolean achou = false;

	int indice = 0;

	ArrayList<Pessoa> vrPessoas = new ArrayList<Pessoa>();

	public void posicaoClientes(String nome) {
		while (!achou) {
			for (int i = 0; i < vrPessoas.size(); i++) {
				if (vrPessoas.get(i).getNome().equals(nome)) {
					System.out.println(vrPessoas.get(i).getNome() + " está na posição \n" + i);
					achou = true;
				}
			}
		}
	}

	public String posicaoClientes(String sNome, int indI, int indF) {
		String message;
		this.indiceInicial = indI;
		this.indiceFinal = indF;
		posicaoAtual = (indiceInicial + indiceFinal) / 2;

		for (int j = 0; j < posicaoAtual; j++) {
			if (vrPessoas.get(j).getNome().equals(sNome)) {
				message = vrPessoas.get(j).getNome() + " Indice " + j;
				return message;
			}
		}

		for (int i = (indiceInicial + posicaoAtual); i < indiceFinal; i++) {
			if (vrPessoas.get(i).getNome().equals(sNome)) {
				message = vrPessoas.get(i).getNome() + " Indice " + i;
				return message;
			}
		}
		message = "nada encontrado";
		return message;
	}
}
