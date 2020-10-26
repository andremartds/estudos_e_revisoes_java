package busca_sequencial;

import javax.swing.*;

public class Sistema {
	public static void main(String[]args){
		
		BuscaSequencial buscaSequencialPessoa = new BuscaSequencial();
		
		// vamos adicionar algumas pessoas ao array list da classe
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Jão"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Pedro"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Jose"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Andre"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Ricardo"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Daniel"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Judas"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Zacarias"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Paulo"));
		buscaSequencialPessoa.vrPessoas.add(new Pessoa("Bernabe"));
		
		// vamos fazer uma busca na posição de josé
		buscaSequencialPessoa.posicaoClientes("Bernabe");
	}

}

