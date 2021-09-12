package oo.threads;

public class PingPongRunnable implements Runnable{
	long times;
	String pingPong;
	PingPongRunnable(){}
	PingPongRunnable(String pPingPong,long pTime ){
		this.pingPong = pPingPong;
		this.times = pTime;
	}
	/*Metodo run obs: n�o se deve chamalo no main*/
	public void run(){
		try{
			for (int i = 0; i < 10; i++) {
				System.out.print(pingPong+" ");
				Thread.sleep(times);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		PingPongRunnable ping = new PingPongRunnable("Ping",1500);
		PingPongRunnable pong = new PingPongRunnable("Pong",1500);
		Thread p = new Thread(ping);
		p.start();
		Thread po = new Thread(pong);
		po.start();
	}

}
