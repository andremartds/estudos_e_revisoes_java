package desafios;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		double numerador = Math.pow(6*(3+2), 2);
		
		double numerador2 = Math.pow((1-5)*(2-7), 2);
		double denominador2 = Math.pow(2, 2);
		numerador2 = numerador2 / denominador2;
		
		
		
		double denominador1 = 3*2;
		numerador = numerador / denominador1;
		double superior = numerador - numerador2;
		
		superior = Math.pow(superior, 3);
		
		
		double inferior = Math.pow(10, 3);
		
		double total = superior / inferior;
		
		System.out.println(total);
			
	
		
		
	}
}
