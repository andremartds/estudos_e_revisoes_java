package linguagem.cronometro;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class ThreadTotal implements Runnable{

	int contador = 1;
	JLabel label = null;
	
	/* o que vou fazer criar tres botões e adicionalo no construtor
	 *  depois vou referencialos na classe do jframe 
	 *  
	 *  
	 *  */
	
	public ThreadTotal(JLabel pLabel){
		label = pLabel;
	}
	
	@Override
	public void run() {
		while(true){
			
			String aux;
			aux = (new SimpleDateFormat("H:m:s").format(new Date()));
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			label.setText(aux);
			label.setFont(new Font("verdana", Font.BOLD, 30));
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
