package oo.encapsulamento;

import javax.swing.JOptionPane;

public class Cavalo {
	
	private String sNome;
	private String sRaca;
	private String sCidadeDoCavalo;
	
	Cavalo(){
	}
	Cavalo(String pNome, String pRaca, String pCidade){
		this.sNome = pNome;
		this.sRaca = pRaca;
		this.sCidadeDoCavalo = pCidade;
	}
	
	public String getNome(){
		return sNome;
	}
	public void setNome(String pNome){
		this.sNome = pNome;
	}
	public String getRaca(){
		return sRaca;
	}
	public void setRaca(String pRaca){
		this.sRaca = pRaca;
	}
	public String getCidade(){
		return sCidadeDoCavalo;
	}
	public void setCidade(String pCidade){
		this.sCidadeDoCavalo = pCidade;
	}
	void imprimeTudo(){
		JOptionPane.showConfirmDialog(null,"O nome do cavaloe � "+ sNome +"\n"
											+"a Ra�a do cavalo � "+ sRaca +"\n"
											+"a cidade do cavalo � "+ sCidadeDoCavalo +"\n");
	}

}
