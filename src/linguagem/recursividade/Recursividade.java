package linguagem.recursividade;

public class Recursividade {
	
	public static int soma (int x){
		if(x == 0){
			return x;
		} else {
			return (x + soma(x-1));
		}
	}
	/* o metodo de potencia se faz com um numero fixo elevado a outro
	 * se a quantidade de vezes multiplicado for 1 sinal que estará na
	 * ultima vez e entao ele retornará o valor, o interessante desse metodo
	 * é que x permanece fixo e a o expoente decrementa fazendo com que
	 * multiplique a quantidade de vezes do expoente passado 
	 *  exemplo 2 elevado a 4 se executa da seguinte forma
	 *  ((2 * 2) = 4) resultado * 2) = 8) resultado * 2 = 16
	 *
	 */
	public static int potencia(int x, int elevado){
		if(elevado == 1){
			return x;
		} else {
			return x * potencia(x, elevado -1);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(soma(10));
		System.out.println(potencia(2,4));
	}

}
