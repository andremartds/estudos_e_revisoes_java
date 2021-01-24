package oo.funcionario_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		System.out.println("#########################");
		
		Funcionario pedro = new Financeiro();
		pedro.setNome("Pedro Martins");
		pedro.setSalario(3000.00);
		pedro.getBonificacao();
		System.out.println(pedro.getNome());
		System.out.println(pedro.getSalario());
		
		System.out.println("#########################");
		
		Gerente joao = new Gerente();
		joao.setNome("João Martins");
		joao.setSalario(3000.00);
		joao.getBonificacao();
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		
		System.out.println("#########################");
		
		Financeiro maria = new Financeiro();
		maria.setNome("Maria Martins");
		maria.setSalario(2500.00);
		maria.getBonificacao();
		System.out.println(maria.getNome());
		System.out.println(maria.getSalario());
		
		System.out.println("#########################");
		
		AcumloBonificacao ac = new AcumloBonificacao();
		System.out.println(ac.bonificacaoTotal(pedro));
		System.out.println(ac.bonificacaoTotal(joao));
		System.out.println(ac.bonificacaoTotal(maria));
		System.out.println("Variável de classe executada: "+AcumloBonificacao.getTotalXBonificacao() + " Vezes");
		
		System.out.println("#########################");
		
		
				
	}
}
