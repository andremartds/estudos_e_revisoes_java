package cateristicas.enums;

public enum EstacoesDoAno {
	
	PRIMAVERA(1), VERAO(2), OUTONO(3), INVERNO(4);
	
	private int val;
	EstacoesDoAno(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	
	
}
