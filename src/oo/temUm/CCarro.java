package oo.temUm;

public class CCarro {
	String sMarca;
	int iVelocidade;
	int iVelocidadeZeroCem;
	private CCarroTemUmMotor motor;
	
	CCarro(){
	}
	public CCarro(String pMarca, int pVelocidade,int pVelocidadeZeroCem){
		this(pMarca,pVelocidade,pVelocidadeZeroCem,null);//estou apontando para o meu construtor que nos parametros traz o objeto motor
	}
	public CCarro(String pMarca, int pVelocidade,int pVelocidadeZeroCem, CCarroTemUmMotor pMotor){
		this.sMarca = pMarca;
		this.iVelocidade = pVelocidade;
		this.iVelocidadeZeroCem = pVelocidadeZeroCem;
		this.setMotor(pMotor);
	}
	public CCarroTemUmMotor getMotor() {
		return motor;
	}
	public void setMotor(CCarroTemUmMotor pMotor) {
		this.motor = pMotor;
	}
}
