package logica_exercicios.numeros_primos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumerosPrimos {
	static int aux;
	static Integer resultado;
    public static void main(String[] args) {
    	cauculaNumeroPrimo();
   }
    
    public static void result(String mensagemMetodo) {
    	resultado = Integer.parseInt(
        		JOptionPane.showInputDialog(null,"Número " + aux + mensagemMetodo +" é Primo!\n"
        				+ "Caso deseje verificar novamente digite qualquer numero exceto ZERO \n "
        				+ "Caso deseje encerrar o programa digite 0"));
    	
    	if(resultado == 0) {
    		System.exit(1);
    	} else {
    		cauculaNumeroPrimo();
    	}
        
    }
    
    public static void cauculaNumeroPrimo() {
    	 Scanner t = new Scanner (System.in);         
         do{
 	        System.out.print("Digite um numero para verificar se ele é primo: ");
 	        int num = t.nextInt();
 	        aux = num;
 	        if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)){
 	            result(" NÃO ");
         }
         else{
             result(" ");
         }
          }while (resultado !=0);
         
    }
}
