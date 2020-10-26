package oo.exemplo_herenaca.funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario pedro = new Funcionario();
		pedro.setNome("Pedro Martins");
		pedro.setSalario(3000.00);
		System.out.println(pedro.getNome());
		System.out.println(pedro.getSalario());
		pedro.getBonificacao();
		
		System.out.println("#########################");
		
		Gerente joao = new Gerente();
		joao.setNome("João Martins");
		joao.setSalario(3000.00);
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		joao.getBonificacao();
		
		System.out.println("#########################");
		
		Financeiro maria = new Financeiro();
		maria.setNome("Maria Martins");
		maria.setSalario(2500.00);
		System.out.println(maria.getNome());
		System.out.println(maria.getSalario());
		maria.getBonificacao();
		
		System.out.println("#########################");
		
		AcumloBonificacao ac = new AcumloBonificacao();
		System.out.println(ac.bonificacaoTotal(pedro));
		System.out.println(ac.bonificacaoTotal(joao));
		System.out.println(ac.bonificacaoTotal(maria));
		System.out.println("Variável de classe executada: "+AcumloBonificacao.getTotalXBonificacao() + " Vezes");
		System.out.println("#########################");
		
		
				
	}
}
