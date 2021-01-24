package oo.contas_herdadas;

class ContaCorrente extends Conta {

	public void deposita(double valor) {
		super.saldo += (valor);
	}

	public void saca(double valor) {
		if (super.saldo < valor) {
			throw new SaldoInsuficienteException(
					"O saldo não é suficiente para saque, Saldo atual é: " + super.saldo + " Você tentou sacar " + valor);
		}
		super.saldo += (valor - 0.10);
	}

	public void atualiza(double taxa) {
		super.saldo -= taxa * 2;
	}

}
