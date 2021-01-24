package cateristicas.lacos;

import java.util.Scanner;

public class Thanos {

	public static void main(String[] args) {
		boolean saida = true;
		while (saida) {
			Scanner s = new Scanner(System.in);
	        System.out.println("Qual o seu nome?");
	        String t = s.nextLine();
	            if(t.equalsIgnoreCase("Thanos")) {
	                System.out.println("Bem-vindo, pode acabar com geral <3");
	            }else {
	                System.out.println("Você não é bem-vindo!");
	                Scanner x = new Scanner(System.in);
	                System.out.println("Quer tentar colocar novamente seu nome?");
	                String n = x.nextLine();
	                    if(n.equalsIgnoreCase("Sim") || n.equalsIgnoreCase("s")) {
	                        saida = true;
	                    }  else {
	    	                saida = false;
	    	                s.close();
	    	                x.close();
	                    }
	            }
		}
		

	}

}
