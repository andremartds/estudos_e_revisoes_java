package oo.funcionario_herdado;

public class SeguroDeVida implements Tributavel{
	private int valor;
	
	@Override
	public double calculaImposto() {
		return this.valor -= 30;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
