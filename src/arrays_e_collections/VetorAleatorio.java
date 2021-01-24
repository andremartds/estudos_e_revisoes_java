package arrays_e_collections;

import java.util.ArrayList;
import java.util.Random;

public class VetorAleatorio {

	public static void embaralhaVetor() {
		Random rAleatorio = new Random();
		for(int i = 1; i <= 52; i++) {
			int num = rAleatorio.nextInt(52)+1;
			System.out.println(num);			
		}

	}

	public static void main(String[] args) {
		embaralhaVetor();
	}
}
