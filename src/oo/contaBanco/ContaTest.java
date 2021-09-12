package oo.contaBanco;

public class ContaTest {
	/**
	 * Andr� Martins
	 */
	public static void main(String[] args) {
		CContaDeBanco oContaBanco = new CContaDeBanco();
		oContaBanco.setCliente("Andr� Martins");
		oContaBanco.setSaudo(10_000.00);
		oContaBanco.vExibSaudo();
		//oContaBanco.vSaca(300);
		//oContaBanco.vExibSaudo();
		//oContaBanco.vDeposito(8_000.000);
		//oContaBanco.vExibSaudo();
 	}

}
