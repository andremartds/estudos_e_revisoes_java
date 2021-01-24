package arrays_e_collections.conta_equals;

import java.util.ArrayList;

public class ContaCorrenteTeste {
	public static void main(String[] args) {
		ArrayList<Conta> conta = new ArrayList<>();
		
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(200);

		ContaCorrente cc1 = new ContaCorrente();
		cc1.setSaldo(200);
		
		conta.add(cc);
		conta.add(cc1);
		
		System.out.println(cc.equals(cc1));
		
		
		
	}
}
