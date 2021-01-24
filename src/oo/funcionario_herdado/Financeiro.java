package oo.funcionario_herdado;

public class Financeiro extends Funcionario {

	public double getBonificacao() {
		System.out.println("Bonificação financeiro");
		return super.salario + 500.0;
	}
}
