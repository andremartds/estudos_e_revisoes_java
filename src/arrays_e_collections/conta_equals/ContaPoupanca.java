package arrays_e_collections.conta_equals;

class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		super.saldo += (valor - 0.10);
	}
	
	public void atualiza(double taxa) {
		super.saldo -= taxa * 3;
	}

}
