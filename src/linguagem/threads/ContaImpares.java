package linguagem.threads;

public class ContaImpares implements Runnable{

	int contador = 1;
	

	@Override
	public void run() {
		while(true){
			contador=contador + 2;
			System.out.println(contador);
		}
		
	}
	/*  */
	void pause(){
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}
}
