package mira;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.File;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class CPrincipal extends JFrame implements Runnable, MouseMotionListener, MouseListener{
	/** Variaveis de referência */
	BufferedImage vrBackground = null;
	Graphics vrGAux = null;
	CSprite vrCSpriteMira = null;
	Socket recebeDados = null;
	DataInputStream canalEntrada = null;
	CSprite vrFundo = null;

	
	/** Construtor da janela e configurações */
	CPrincipal() {
		/** Configurações da janela */
		setSize(800,600);
		setTitle("Mira");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		/** inicia socket */
		try {
			recebeDados = new Socket("127.0.0.1", 4050);
			canalEntrada = new DataInputStream(recebeDados.getInputStream());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		vrFundo = new CSprite("xadrez.png", 800, 600, 800, 600, 0, 0);
		
		/** instanciando objetos de imagem, BufferedImage é necessario para a tela não piscar */
		vrBackground = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		/** Grafics auxiliar recebe essa especificação de pinturad de tela */
		vrGAux = vrBackground.getGraphics();
		
		/** Passo no construtor o nome da imagem que no caso é uma Image na classe Sprite*/
		vrCSpriteMira = new CSprite("mira2.png",100,100,100,100,0,0);

		
		/**  Para retirar o moouse da tela */
/*		Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().
															getImage(""),new Point(0,0),"invisible");
		
		setCursor(cursor);*/
		
		/** registra janela ao tratador de eventos */
		
		
		/** starto minha thread*/
		Thread vrThread = new Thread(this);
		vrThread.start();
		
		/* visibilidade da janela */
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.drawImage(vrBackground, 0, 0, null);
		
	}
	/** Metodo para rodar a Thread */
	@Override
	public void run() {

		while (true) {
			try {
				/*
				 * StringTokenizer mensagem = new
				 * StringTokenizer(canalEntrada.readUTF(),";"); String[] ms =
				 * new String[2]; for (int i = 0; i < mensagem.countTokens();
				 * i++) { ms[i] = mensagem.nextToken(); }
				 * if(ms[1].equalsIgnoreCase("sair")){ System.exit(0); } else {
				 * vrCSpriteMira.posX =Integer.parseInt(ms[1]);
				 * vrCSpriteMira.posY =Integer.parseInt(ms[2]); } }
				 * catch(Exception ex){ ex.printStackTrace(); }
				 */
				//
					desenha();
					int posX = canalEntrada.readInt();
					int posY = canalEntrada.readInt();
					//int posY = Integer.parseInt(canalEntrada.readUTF());
					if (posX == KeyEvent.VK_ESCAPE || posY == KeyEvent.VK_ESCAPE) {
						System.exit(0);
					} else {
						vrCSpriteMira.posX =posX;
						vrCSpriteMira.posY =posY;
					}
					
					pausa(30);
					atualizaAnime();
				//}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	/** metodo para desenhar na tela, é passado o grafics para fazer os desenhos e por fim é chamado
	 * o metodo desenha da classe Sprite e é passado essa grafics e depois de tudo é feito o repaint 
	*/
	public void desenha(){	
		//vrGAux.setColor(Color.YELLOW);
		vrGAux.fillRect(0, 0, 800, 600);
		//vrFundo.desenha(vrGAux);
		
		//canguru.desenha(vrGAux);
		//vrGAux.fillRect(0, 0, 800, 600);
		
		vrCSpriteMira.desenha(vrGAux);
		repaint();
	}
	/** Metodo para pausa */
	public void pausa(int tempo){
		try{
			Thread.sleep(tempo);
		} catch(Exception e){
			
		}
	}
	
	/** metodo chamado quado o mouse for arrastado */
	public void mouseDragged(MouseEvent evento) {
		//vrCSpriteMira.posX = evento.getX();
		//vrCSpriteMira.posY = evento.getY();
	}
	/** Metodo chamado quando o mouse é movido */
	public void mouseMoved(MouseEvent evento) {
		//vrCSpriteMira.posX = evento.getX();
		//vrCSpriteMira.posY = evento.getY();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void atualizaAnime(){
		vrCSpriteMira.atualizaAnimacao();
	}
	public static void main(String[] args) {
		new CPrincipal();
	}
}

