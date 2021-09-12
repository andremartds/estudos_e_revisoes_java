package arrays_e_collections.conta_equals;

public abstract class Conta {
	protected double saldo;

	public abstract void deposita(double valor);
	
	public void saca(double valor) {
		if(saldo > valor) {
			this.saldo -= valor;
		}
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Saldo da conta = "+this.saldo ;
	}
	@Override
	public boolean equals(Object ref) {
		Conta conta = (Conta) ref;
		if(this.saldo != conta.getSaldo()) {
			return false;
		}
		return true;
		
	}
	

}