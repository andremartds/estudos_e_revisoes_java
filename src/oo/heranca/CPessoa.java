package oo.heranca;

import javax.swing.JOptionPane;

public class CPessoa {

	private String sNome;
	private String sEmail;
	private String sRg;
	private String sEndereco;
	private String sCidade;
	private int iConta;

	CPessoa(String pNome) {
		this.sNome = pNome;
	}

	CPessoa(String pNome, String pEmail,String pRg,String pEndereco,String pCidade,int pConta) {
		this.sNome = pNome;
		this.sEmail = pEmail;
		this.sRg = pRg;
		this.sEndereco = pEndereco;
		this.sCidade=pCidade;
		this.iConta = pConta;
	}
	CPessoa() {
		this.sNome = JOptionPane.showInputDialog(null,"Digite seu nome");
		this.sEmail = JOptionPane.showInputDialog(null,"Digite seu Email");
		this.sRg = JOptionPane.showInputDialog(null,"Digite seu RG");
		this.sEndereco = JOptionPane.showInputDialog(null,"Digite seu Endere�o");
		this.sCidade= JOptionPane.showInputDialog(null,"Digite sua Cidade");
		this.iConta =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua Conta "));
	}
	public String getNome(){
		return sNome;
	}
	public String setNome(String pNome){
		return sNome = pNome;
	}
	public String getEmail() {
		return sEmail;
	}
	public String getRg(){
		return sRg;
	}
	public String getEndereco(){
		return sEndereco;
	}
	public String getCidade(){
		return sCidade;
	}
	public int getConta(){
		return iConta;
	}
	void salario(int salario){
		System.out.print("o seu salario é o salario base da empres 700,00 ");
	}

}
