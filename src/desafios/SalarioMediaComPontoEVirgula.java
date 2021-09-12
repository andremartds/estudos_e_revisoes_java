package desafios;

import java.util.Scanner;

public class SalarioMediaComPontoEVirgula {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Primeiro salário: ");
	String salario1 = entrada.nextLine().replace(",", ".");
	System.out.print("\nSegundo salário: ");
	String salario2 = entrada.nextLine().replace(",", ".");
	System.out.print("\nTerceiro salário: ");
	String salario3 = entrada.nextLine().replace(",", ".");
	
	double valor1 = Double.parseDouble(salario1);
	double valor2 = Double.parseDouble(salario2);
	double valor3 = Double.parseDouble(salario3);
	
	double media = (valor1 + valor2 + valor3 ) / 3;
	
	System.out.println("A média salarial é: "+ media);
	
	entrada.close();
}
}
