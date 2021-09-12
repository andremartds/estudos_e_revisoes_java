package oo.heranca;


public class CGerente extends CFuncionario {
	
	private int iAgencia;
	
	public int getAgencia(){
		return iAgencia;
	}
	public void setAgencia(int pAgencia){
		this.iAgencia = pAgencia;
	}
	
	void salario(int salario){
		System.out.println("ola gerente o seu salario é "+salario);
	}
}
