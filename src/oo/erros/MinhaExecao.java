package oo.erros;

@SuppressWarnings("serial")
public class MinhaExecao extends Exception{
	
	String senha;
	public MinhaExecao(String pNome){
		this.senha = pNome;
	}
}
