package linguagem.cronometro;

import java.awt.Font;

import javax.swing.JLabel;

public class Segundos implements Runnable{
	
	int contador = 1;
	JLabel label = null;
	
	public Segundos(JLabel pLabel){
		label = pLabel;
	}
	

	@Override
	public void run() {
		while(true){
			
			contador+=1;
			String aux;
			aux = Integer.toString(contador);
			label.setText(aux);
			label.setFont(new Font("verdana", Font.BOLD, 30));
			
			
		}
		
	}
	/*  */
	void pause(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
	}

}
