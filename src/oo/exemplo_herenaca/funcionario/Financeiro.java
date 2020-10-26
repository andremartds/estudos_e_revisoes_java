package oo.exemplo_herenaca.funcionario;

public class Financeiro extends Funcionario {

	public double getBonificacao() {
		System.out.println("Bonificação financeiro");
		return super.salario + 500.0;
	}
}
