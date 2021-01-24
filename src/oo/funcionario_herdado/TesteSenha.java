package oo.funcionario_herdado;

public class TesteSenha {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(333);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(cliente);
	}
}
