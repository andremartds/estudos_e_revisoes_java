package oo.exemplo_herenaca.funcionario;

public class Funcionario {
	protected double salario;
	private String nome;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação Funcionario comum");
		return this.salario * 0.1;
	}
	
}
