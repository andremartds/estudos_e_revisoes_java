package linguagem.threadNumeroCrescente;

import java.awt.Font;

import javax.swing.JLabel;


public class ContaPares implements Runnable{

	JLabel label = null;
	
	
	int contador = 2;
	
	ContaPares(JLabel plabel)
	{
		label = plabel;
	}

	@Override
	public void run() {
		while(true){
			contador=contador + 2;
			String str;
			str = Integer.toString(contador);
			label.setText(str);
			label.setFont(new Font("Verdana", Font.BOLD, 30));
			
			//System.out.println(contador);
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
