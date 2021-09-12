package oo.herancaAnimal;

public class CAnimal extends Object {
	
	private String sNome;
	private int iPeso;
	
	CAnimal (String pNome, int pPeso){
		this.setNome(pNome);
		this.setPeso(pPeso);
	}
	
	void vDormir(){
		System.out.println("Dormindo ");
	}
	
	void vFazerBarulho(){
		System.out.println("Fazendo barulho ");
	}

	public String getNome() {
		return sNome;
	}

	public void setNome(String sNome) {
		this.sNome = sNome;
	}

	public int getPeso() {
		return iPeso;
	}

	public void setPeso(int iPeso) {
		this.iPeso = iPeso;
	}

}
