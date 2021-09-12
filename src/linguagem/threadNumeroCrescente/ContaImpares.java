package linguagem.threadNumeroCrescente;

import java.awt.Font;

import javax.swing.JLabel;

public class ContaImpares implements Runnable{
	
	int contador = 1;
	JLabel label = null;
	
	ContaImpares(JLabel pLabel){
		label = pLabel;
	}
	

	@Override
	public void run() {
		while(true){
			contador=contador + 2;
			String str;
			str = Integer.toString(contador);
			label.setText(str);
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
