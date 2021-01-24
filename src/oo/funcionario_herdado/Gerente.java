package oo.funcionario_herdado;

public class Gerente extends Funcionario implements Autentica{

	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		System.out.println("Bonificação Gerente");
		return super.salario + 1000.0;
	}
	
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		} else {
			return false;	
		}
	}
}
