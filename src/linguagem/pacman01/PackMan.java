package linguagem.pacman01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PackMan extends JFrame implements KeyListener, Runnable {
	JLabel label = null;
	int contador = 0;
	int autura = -1;
	int direita = -2;
	int esquerda = -3;
	int baixo = -4;

	
	public PackMan(){
		super("PackMan");
		label = new JLabel();
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
		//setLocation(100,100);
		setSize(600, 600);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addKeyListener(this);
	}
	
	public void paint(Graphics g){
		if (g!=null) {
			g.setColor(Color.RED);
			g.setColor(Color.YELLOW);
			g.fillArc(contador, contador, 70, 70, 135, -270);
			g.setPaintMode();
			
			//repaint();
		}
		
	}
	public void movimenta(int parametro){
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent evento) {
		Thread t = new Thread(this);
		if(evento.getKeyCode() == KeyEvent.VK_UP){
			repaint();
			movimenta(-1);
			t.start();
			
		}
		if(evento.getKeyCode() == KeyEvent.VK_LEFT){
			t.start();
			repaint();
		}
		if(evento.getKeyCode() == KeyEvent.VK_RIGHT){
			t.start();
			repaint();
		}
		if(evento.getKeyCode() == KeyEvent.VK_DOWN){
			t.start();
			repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new PackMan();
	}

	@Override
	public void run() {
		while(true)
		{
			while (contador < 600) {
				contador += 1;
				pause();
			}
			contador = 600;
			while (contador > 0) {
				contador -= 1;
				pause();
			}
		}
		
	}
	public void pause() {
		try {
			Thread.sleep(30);
		} 
		catch (Exception e) {}
	}

}
