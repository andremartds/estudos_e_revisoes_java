package oo.empregado;

public class CEmpregadoTeste {
	public static void main(String[] args) {
		
		CEmpregado funcionario2 = new CEmpregado("Pedro ", "Martins ",-1_500);
		funcionario2.setSalarioMensal(-1_500);
		System.out.println("o seu salario mensal � "+funcionario2.getSalarioMensal());
		System.out.println("Salario Bonuns = "+funcionario2.salarioBonus());
		System.out.println("Salario Anual sem bonus = "+funcionario2.salarioAnual());
		System.out.println("Salario Anual com bonus = "+funcionario2.salarioAnualBonus());
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		CEmpregado funcionario3 = new CEmpregado("Manoel ","Martins",1_000);
		System.out.print(funcionario3.getNome());
		System.out.println(funcionario3.getSobreNome());
		System.out.println("Salario Mensal"+funcionario3.getSalarioMensal());
		System.out.println("Salario Bonuns = "+funcionario3.salarioBonus());
		System.out.println("Salario Anual Com bonus = "+funcionario3.salarioAnualBonus());
		System.out.println("Salario Anual sem bonus = "+funcionario3.salarioAnual());
	
	

		
	
		
	}

}
