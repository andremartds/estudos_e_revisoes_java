package cateristicas.lacos;

public class doWhile {

	public static void main(String[] args) {
		int cont = 0; // começamos em zero certo? 

        while(cont <= 10) {
            System.out.println(cont); // não somamos ainda, então está zero, então ele imprime zero
            cont++;            
        }
        
        do {
        	System.out.println(cont); // não somamos ainda, então está zero, então ele imprime zero
        	cont++;            
        } while(cont <= 10);
	}
	
}
