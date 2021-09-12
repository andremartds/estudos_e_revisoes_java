package oo.threads;

public class PingPong extends Thread{
	long times;
	String pingPong;
	PingPong(){}
	PingPong(String pPingPong,long pTime ){
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
		new PingPong("Ping", 1500).start();
		new PingPong("PONG", 1500).start();
	}

}
