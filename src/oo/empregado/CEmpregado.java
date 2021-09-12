package oo.empregado;

public class CEmpregado {
	
	private String sNome;
	private String sSobreNome;
	private double dSalarioMensal;
	
	CEmpregado(){
	}
	CEmpregado(String pNome, String pSobrenome, double pSalarioMensal){
		this.sNome = pNome;
		this.sSobreNome = pSobrenome;
		this.dSalarioMensal = pSalarioMensal;
	}
	public double getSalarioMensal(){
		return dSalarioMensal;
	}
	public void setSalarioMensal(double pSalario){
		
		if(dSalarioMensal <= 0){
			dSalarioMensal = 0;
		}else
			dSalarioMensal=pSalario;
	}
	
	
	public String getNome(){
		return sNome;
	}
	public void setNome(){
		return;
	}
	public String getSobreNome(){
		return sSobreNome;
	}
	public void setSobreNome(String pSobreNome){
		sSobreNome = pSobreNome;
	}

	public double salarioAnual(){
		return dSalarioMensal * 12;		
	}

	public double salarioBonus(){
		double iAcumulaSalario = dSalarioMensal;
		iAcumulaSalario = (this.dSalarioMensal / 100) * 10;
		return iAcumulaSalario + this.dSalarioMensal;
		
	}
	public double salarioAnualBonus(){
		return salarioBonus() * 12;

	}

}
