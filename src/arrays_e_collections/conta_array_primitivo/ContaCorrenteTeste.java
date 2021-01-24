package arrays_e_collections.conta_array_primitivo;

public class ContaCorrenteTeste {
	public static void main(String[] args) {
		ControllerConta controller = new ControllerConta();
		
		Conta cc = new ContaCorrente();
		cc.deposita(200);
		
		Conta cp = new ContaCorrente();
		cp.deposita(300);
		
		controller.addConta(cc);
		controller.addConta(cp);
		
		System.out.println(controller.getSizeQuantidadeConta()); // imprime a quantidade de contas
		
		System.out.println(controller.getReferencia(1)); //deve retornar null pois foi deletada

		System.out.println(controller.remove(1));
		
		System.out.println(controller.getSizeQuantidadeConta()); // imprime a quantidade de contas
		
		
		System.out.println(controller.getReferencia(1)); //deve retornar null pois foi deletada
		
		
	}
}
