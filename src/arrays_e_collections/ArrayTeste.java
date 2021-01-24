package arrays_e_collections;

import java.util.ArrayList;

public class ArrayTeste {
	int quantidadeDeInseridos, aux;
	int iguais;
	ArrayList<String> nome = new ArrayList<>();

	public void addArray(String nomeNovo) {
		if (this.nome.add(nomeNovo)) {
			quantidadeDeInseridos = quantidadeDeInseridos + 1;
			aux = quantidadeDeInseridos;

		}
	}

	int j = 1;

	public void achaIguais() {
		for (int i = 0; i < nome.size(); i++) {
			if (this.nome.get(i).equals(this.nome.get(j))) {
				iguais = iguais + 1;
				j++;
				if ((j) == nome.size()) {
					break;
				}
			} else {
				j++;
			}
			if ((j) == nome.size()) {
				break;
			}
		}
	}

	public void imprimirArray() {
		for (String string : nome) {
			System.out.println(string);
		}
		System.out.println("a quantidade de inseridos foi: " + quantidadeDeInseridos);
		System.out.println("iguais: " + iguais);

	}

}
