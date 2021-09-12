package oo.erros;

public class ErrosTest {
	static void autentica(String e) throws MinhaExecao{
		if("123".equals(e)){
			System.out.println("entrou ");
		} else
			throw new MinhaExecao("N�o entrou");
	}
	public static void main(String[] args) {
		try {
			autentica("1232");
		} catch (MinhaExecao e) {
			e.printStackTrace();
			e.getMessage();
		}
		finally{
			System.out.println("executou aqui");
		}
		
	}

}
