package linguagem.zeroOitocentos;


import java.awt.Graphics;
import javax.swing.JLabel;


public class MinhaThread implements Runnable {
	
	Graphics grafic = null;
	Frame f;
	void metodoGrafiq(Graphics pG) {
		grafic = pG;
	}
	
	int contador = 0;
	JLabel label = null;

	public MinhaThread(Frame pFrame) {
		label = pFrame.label;
		f = pFrame;
	}
	public MinhaThread() {}

	@Override
	public void run() 
	{
		while(true)
		{
			while (contador < 300) 
			{
				contador += 1;
				if (f != null)
					f.repaint();
				pause();
			}
			
			contador = 300;
			
			while (contador > 0) 
			{
				contador -= 1;
				if (f != null)
					f.repaint();
				pause();
			}
		}
		
	}

	void pause() 
	{
		try 
		{
			Thread.sleep(30);
		} 
		catch (Exception e) 
		{

		}
	}

}
