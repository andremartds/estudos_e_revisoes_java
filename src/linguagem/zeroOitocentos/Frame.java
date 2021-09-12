package linguagem.zeroOitocentos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame implements KeyListener{
	Frame vrFrame = null;
	MinhaThread m = null;
	JLabel label = new JLabel();
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent evento) {
		if(evento.getKeyCode() == KeyEvent.VK_UP){
			
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		public void paint(Graphics g){
			if (g!=null)
			{
				g.setColor(Color.RED);
				//g.fillRect(0, 0, 300,300);
				g.setColor(Color.YELLOW);
				//g.fillRect(m.contador, 100, 50, 50);
				//g.drawString("Novo texto", 100, 50);
				g.fillArc(m.contador, 50, 200, 200, 135, -270);
			}
			
		}
		public Frame() {
			super("Numeros crescentes");
			setLayout(new BorderLayout());
			add(label, BorderLayout.CENTER);
			setLocation(940,25);
			setSize(300, 300);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			m = new MinhaThread(this);
			Thread t1 = new Thread(m);
			t1.start();
			addKeyListener(vrFrame);
			setVisible(true);
		}
		
		
		public static void main(String[] args) {
			new Frame();	
		}


}
