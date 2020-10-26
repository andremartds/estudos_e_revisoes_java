package logica_exercicios;

import java.util.Scanner;

public class MediaScanner {

    public static void main(String[] args) {
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	boolean continua = true;
    	do{
	        String[] nome = new String[10];
	        int[] idade = new int[10];
	        String[] endereco = new String[10];
	        String[] serie = new String[10];
	        double[] medianotas = new double[10];
	        try{
		        for (int i = 1; i <= 3; i++) {
		
		            System.out.println("NOME: ");
		            nome[i] = sc.nextLine();
		
		            System.out.println("IDADE: ");
		            idade[i] = Integer.parseInt(sc.nextLine());
		
		            System.out.println("ENDERE�O: ");
		            endereco[i] = sc.nextLine();
		
		            System.out.println("S�RIE: ");
		            serie[i] = sc.nextLine(); 
		
		            System.out.println("M�DIA DAS NOTAS: ");
		            medianotas[i] = Double.parseDouble(sc.nextLine());
				}
		
		        for (int i = 1; i <= 3; i++) {
		            if (medianotas[i] >= 7) {
		            	System.out.println("Alunos com m�dia acima ou igual a 7");
		                System.out.println("Aluno "+nome[i] + " M�dia "+medianotas[i]);
		            } else {
		            	System.out.println("Alunos com m�dia abaixo de 7");
		                System.out.println("Aluno "+nome[i] + " M�dia "+medianotas[i]);
		                continua = false;
		            }
		        }
	        }catch(NumberFormatException e){
	        	System.out.println("Favor digitar nuneros inteiros ");
	        	sc.nextLine();
	        }
	        finally{
	        	System.out.println("executou Finally...");
	        }
    	 }while(continua);  
}
}