package oo.exemplo_herenaca.funcionario;

public class Gerente extends Funcionario {

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
}
