package oo.galinha;

public class CGalinhaTest {

	/**
	 * @param args
	 * Andr� Martins
	 */
	public static void main(String[] args) {
		CGalinha galinhaA = new CGalinha();
		galinhaA.botaOvo().botaOvo().botaOvo().botaOvo();

		CGalinha galinhaB = new CGalinha();
		galinhaB.botaOvo();
		galinhaB.botaOvo();

		System.out.println(galinhaA.iOvos);
		System.out.println(galinhaB.iOvos);
		
		System.out.println("Todos os ovos da granja são = "+CGalinha.todosOvos);// chamo direto pelo nome da classe n�o preciso instanciar
		System.out.println("a m�dia de ovos da granja é "+CGalinha.iMediaOvos(2));
		
	}

}
