package oo.funcionario_herdado;

public class Cliente implements Autentica{
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
