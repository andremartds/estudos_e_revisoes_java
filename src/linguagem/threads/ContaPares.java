package linguagem.threads;

public class ContaPares implements Runnable{
	/* a interface runable diz o que a thread vai fazer */
	
	int contador = 2;
	

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
