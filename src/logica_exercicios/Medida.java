package logica_exercicios;

/*Jos� tem 1,50 m e cresce 2 cent�metros por ano. Pedro tem 1,10 m e cresce 3 cent�metros por ano.
 * Construa uma classe que calcule em quantos anos Pedro ser� maior que Jos�*/

public class Medida {
	
	double jose = 1.50;
	double pedro = 1.10;
	int scape = 0;
	
	public void converte(){
		while(jose > pedro){
			jose = jose + 0.2;
			pedro = pedro + 0.3;
			scape = scape + 1;			
		}System.out.println(scape);
		
	}
	public static void main(String[]args){
		Medida quantosAnos = new Medida();
		quantosAnos.converte();
	}


}
