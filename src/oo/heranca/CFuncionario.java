package oo.heranca;


public class CFuncionario extends CPessoa {

	CFuncionario(String pNome){
		super.getNome();		
	}
	CFuncionario(){
	}
	void salario(int salario) {
		System.out.println("ola funcionario o seu salario é "+salario);
	}

}
