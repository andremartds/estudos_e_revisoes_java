package oo.arquivos;

public class ContaBanc {
	private String sCliente;
	private double dSaudo;
	
	
	ContaBanc(){}
	ContaBanc(String pCliente){
		this.sCliente = pCliente;		
	}
	ContaBanc(String pCliente, double pSaudo){
		this.sCliente = pCliente;	
		this.dSaudo = pSaudo;
	}
	public String getCliente(){
		return sCliente;
	}
	public void setCliente(String pCliente){
		this.sCliente = pCliente;
	}
	
	public double getSaudo(){
		return dSaudo;
	}
	public void setSaudo(double pSaudo){
		this.dSaudo = pSaudo;
	}
	
	void vExibSaudo(){
	System.out.println("Ol� "+sCliente+" o seu sa�do � "+getSaudo());
	}
	void vSaca(double vValor){
		dSaudo -= vValor;
	}
	void vDeposito(double vValor){
		dSaudo+=vValor;
	}
	void vTransfDestino(ContaBanc ContaDestino, double vValor){
		this.vSaca(vValor);
		ContaDestino.vDeposito(vValor);
	}
	
}
