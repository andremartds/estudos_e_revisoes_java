package logica_exercicios;


public class MegaSena {

	public static void main(String[] args) {

		int[] aleatorio = new int[6];
		
		boolean sair = false;

		for (int i = 0; i < 6; i++) {
			int n = (int) (Math.random() * 6);
			for (int j = 0; j < aleatorio.length; j++) {
				if(aleatorio[j] == n){
					sair = true;
					break;
				}
				if(sair){
					i--;
				} else{
					aleatorio[i] = n;
				}
				
			}
		}
		for (int i = 0; i < aleatorio.length; i++) {
			System.out.println(aleatorio[i]);
		}
		

	}

}
