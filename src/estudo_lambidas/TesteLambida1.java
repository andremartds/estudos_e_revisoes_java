package estudo_lambidas;

import java.util.*;

public class TesteLambida1 {

	public static void main(String[] args) {
		Conta c = new ContaPoupanca();
		Pessoa p = new Pessoa();
		p.setNome("Roberto");
		c.setTitular(p);

		ContaCorrente cc = new ContaCorrente();
		Pessoa p2 = new Pessoa();
		p2.setNome("Bia");
		cc.setTitular(p2);

		ContaPoupanca cp = new ContaPoupanca();
		Pessoa p3 = new Pessoa();
		p3.setNome("Maria");
		cp.setTitular(p3);

		c.deposita(800);
		cc.deposita(500);
		cp.deposita(900);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		List<Conta> lista = new ArrayList<>();
		lista.add(c);
		lista.add(cc);
		lista.add(cp);

		for (Conta conta : lista) {
			System.out.println(conta.getSaldo() + " Titular " + conta.getTitular().getNome());
		}
		System.out.println("########################################################");
		// ComparaSaldoConta comparator = new ComparaSaldoConta(); // comparator Saldo
		// ComparatorNome comparator = new ComparatorNome();
		lista.sort((c1, c2) -> {
			String refNomeUm = c1.getTitular().getNome();
			String refNomeDois = c2.getTitular().getNome();
			return refNomeUm.compareTo(refNomeDois);
		});
		
		lista.forEach(conta->System.out.println(conta.getSaldo() + " Titular " + conta.getTitular().getNome()));
		
		System.out.println("########################################################");
		
		lista.sort((c1, c2) -> Double.compare(c1.getSaldo(), c1.getSaldo())); // a primeira vez que eu escrevi uma
																				// lambida

		lista.forEach(conta -> System.out.println(conta.getSaldo() + " Titular " + conta.getTitular().getNome()));


	}
}
