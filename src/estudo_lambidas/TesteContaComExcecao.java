package estudo_lambidas;

public class TesteContaComExcecao {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(200);
		
		try {
			conta.saca(300);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
