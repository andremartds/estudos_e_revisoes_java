package oo.tratamentoExceptions;

public class CTratamentoDeErrosTest {

	static void senha(String pSenha) throws CTratamentoDeErros{
		if ("123".equals(pSenha)) {
			System.out.println("Senha Correta");
		} else
			throw new CTratamentoDeErros("Senha Incorreta");
	}

	public static void main(String[] args) {
		try {
			senha("123");
		} catch (CTratamentoDeErros e) {
			System.out.println(e.getMessage());
		}

	}

}
