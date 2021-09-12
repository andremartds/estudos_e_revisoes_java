package oo.classesWrapers;

public class CPessoaTest {
	public static void main(String []args){
		// declara��o de uma variavel de referencia para um objeto
		CPessoa vrPessoa = null;
		CPessoa vrPessoa2 = null;
		CPessoa cCopia = null;
		vrPessoa = new CPessoa();//valida��o da variavel de referencia
		vrPessoa2 = new CPessoa();
		cCopia = new CPessoa();
		vrPessoa.iIdade = 30;//chamei o atributo iIdade do objeto pessoa
		vrPessoa2.sNome = "Teste";
		cCopia = vrPessoa;
		
	
		
		//Impress�o do valor da variavel de referencia
		System.out.println(vrPessoa.iIdade);//mais o atributo do objeto Cpessoa iIdade
		System.out.println(vrPessoa2.sNome);
		System.out.println(cCopia.iIdade);
		
	}
}
