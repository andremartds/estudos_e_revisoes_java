package estudo_lambidas;

class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		super.saldo += (valor - 0.10);
	}
	
	public void atualiza(double taxa) {
		super.saldo -= taxa * 3;
	}

}
