package oo.funcionario_herdado;

public class SeguroCarro implements Tributavel {
	private int valor;
	
	public double calculaImposto() {
		return this.valor -= 10;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}
