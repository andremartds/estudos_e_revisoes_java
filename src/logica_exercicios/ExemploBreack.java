package logica_exercicios;

public class ExemploBreack {
	public static void main(String[] args) {
		int total = 20;
		int totalAux = total;
		String espaco = "";
		for (int i = 1; i <= total; i++) {
			for (int j = 1; j <= i; j++) {
				if(j>i) break;
				for (int e = 1; e < totalAux; e++) {
					if(j>1) break;
					System.out.print(' ');
				}
				if(j==1) {
					totalAux -= 1;
				}
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
