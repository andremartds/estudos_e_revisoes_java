package linguagem.pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pacman extends JFrame implements Runnable, KeyListener, MouseMotionListener, MouseListener {
	JLabel label = null;
	int posX = 0;
	int posY = 250;
	BufferedImage vrBuffer = null;
	Graphics vrGrafics = null;
	boolean telaPausada = false;
	Image mira = null;
	double vrDoublePonto = 0;
	
	int posMiraX = 0, posMiraY = 0;

	public Pacman() {
		super("PackMan");
		label = new JLabel();
		add(label, BorderLayout.CENTER);
		setSize(800, 600);
		try{
			mira = ImageIO.read(getClass().getResource("mira.png"));
		} catch(Exception e){
			
		}

		/* crio uma imagem */
		vrBuffer = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		/*
		 * ponteiro para imagem que eu criei tudo que se criar com ele será
		 * pintado na imagem
		 */
		vrGrafics = vrBuffer.getGraphics();
		

		Thread vrThread = new Thread(this);
		vrThread.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().
				getImage(""),new Point(0,0),"invisible");
		
		setCursor(cursor);
		eventos();
		setVisible(true);
	}

	/* metodo que realiza a atualizacao do posicionamento */
	void atualiza() {
		posX += 10;
		if (posX > 900) {
			posX = -100;
		}
	}

	void desenha() {
		vrGrafics.setColor(Color.RED);
		vrGrafics.fillRect(0, 0, 800, 600);
		vrGrafics.setColor(Color.YELLOW);
		vrGrafics.fillArc(posX, posY, 100, 100, 100, 360);
		vrGrafics.drawImage(mira, posMiraX, posMiraY, null);
	}

	void pausa(int tempo) {
		try {
			Thread.sleep(tempo);

		} catch (Exception e) {

		}
	}

	public void paint(Graphics g) {
		g.drawImage(vrBuffer, 0, 0, null);
	}

	@Override
	public void run() {
		while (true) {
			if(telaPausada == false){
				atualiza();
			}
			desenha();
			repaint();
			pausa(40);	
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent evento) {
		if(evento.getKeyCode() == KeyEvent.VK_P){
			/* se tela pauasada for nao tela pausada */
			telaPausada =! telaPausada;	
		}
/*		if(evento.getKeyCode() == KeyEvent.VK_UP){
			mouseMove(null, posX, posY);
		}*/
		
	}
	public void move1(MouseEvent evento){
		posX = evento.getX();
	}

	@Override
	public void keyReleased(KeyEvent e) {}


	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		posMiraX = e.getX();
		posMiraY = e.getY();
		
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		if(evento.getSource() == this){
			/** se a imagem estiver em cima da bola se defaz da bola e incrementa mais
			 * um ponto
			 */
			posMiraX = evento.getX();
		//	posX = posX - 900;
			
			System.out.println("posMiraX = "+ posMiraX + "posX = "+ posX);
			
			double vrDoubleXDivisao = posX / 2;
			double vrDoublePosMiraX = posMiraX / 2;
			
			if(vrDoubleXDivisao == vrDoublePosMiraX){
				JOptionPane.showConfirmDialog(null, "ok");
				vrDoublePonto++;
				
			} 
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	void eventos(){
		addKeyListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	/* Main */
	public static void main(String[] args) {
		new Pacman();
	}
}
