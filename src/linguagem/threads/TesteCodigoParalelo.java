package linguagem.threads;

public class TesteCodigoParalelo {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ContaPares());
		Thread t2 = new Thread(new ContaImpares());
		
		t1.start();
		t2.start();
		
	}

}
