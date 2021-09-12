package linguagem.cronometro;

import java.awt.Font;

import javax.swing.JLabel;

public class Horas implements Runnable{
	/* a interface runable diz o que a thread vai fazer */
	
	int contador = 1;
	JLabel label = null;
	
	public Horas(JLabel pLabel){
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
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}

}
