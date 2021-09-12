package linguagem.particulas;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.swing.JFrame;

public class CPrincipal extends JFrame implements Runnable, MouseMotionListener, MouseListener{
	/** Variaveis de referência */
	BufferedImage vrBackground = null;
	Graphics vrGAux = null;
	CSprite vrCSpriteMira = null;
	CSprite vrFundo = null;
	CSprite[] vrInimigos = null;
	//CSprite canguru = null;
	Random vrSorteio = null;
	//AudioClip som = null;
	
	boolean tiro = true;
	
	Mp3 musica = null;
	File mp3File = null;
	
	/** Construtor da janela e configurações */
	CPrincipal() {
		/** Configurações da janela */
		setSize(800,600);
		setTitle("particulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		/** som ....*/
	    //String com o caminho do arquivo MP3 a ser tocado
	    String path = "/Volumes/Dados/developer/Workspaces/Linguagem3/linguagemIII/src/s.mp3";
	    //Instanciação de um objeto File com o arquivo MP3
	    mp3File = new File(path);
	    //Instanciação do Objeto MP3, a qual criamos a classe.
	    musica = new Mp3(mp3File);
	    //Finalmente a chamada do método que toca a música
	    
		
		
/*		try{
		som = Applet.newAudioClip(new URL("som.mp3"));
		} catch(Exception e){
			
		}*/
		/** Fim do som*/
		
		vrFundo = new CSprite("xadrez.png", 800, 600, 800, 600, 0, 0);
		
		/** instanciando objetos de imagem, BufferedImage é necessario para a tela não piscar */
		vrBackground = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		/** Grafics auxiliar recebe essa especificação de pinturad de tela */
		vrGAux = vrBackground.getGraphics();
		
		/** Passo no construtor o nome da imagem que no caso é uma Image na classe Sprite*/
		vrCSpriteMira = new CSprite("mira2.png",100,100,100,100,0,0);
		//vrCSpriteMira.posX = 300;
		//vrCSpriteMira.posY = 300;
		
		/* instancia o objeto randomico */
		vrSorteio = new Random();
		/** instancia e aloca o vetor de sprites inimigos*/
		vrInimigos = new CSprite[20];
		for (int i = 0; i < vrInimigos.length; i++) {
			vrInimigos[i] = new CSprite("Kangoo.gif",450,360,75,90,vrSorteio.nextInt(24),23);
			vrInimigos[i].posX = vrSorteio.nextInt(500);
			vrInimigos[i].posY = vrSorteio.nextInt(700);
		}
		//vrImage, 200, 200, 200+largura*2, 200+altura*2, largura+largura, 0, 75 , altura, null);
/*		canguru = new CSprite("kangoo.gif");
		canguru.posX = 100;
		canguru.posY = 100;*/
		
		/**  Para retirar o moouse da tela */
/*		Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().
															getImage(""),new Point(0,0),"invisible");
		
		setCursor(cursor);*/
		
		/** registra janela ao tratador de eventos */
		addMouseMotionListener(this);
		addMouseListener(this);
		
		
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
		while(true){
			desenha();
			pausa(100);
			atualizaAnime();
			if(!tiro){
				tiro=true;
				som();
			}
			
		}
		
	}
	/** metodo para desenhar na tela, é passado o grafics para fazer os desenhos e por fim é chamado
	 * o metodo desenha da classe Sprite e é passado essa grafics e depois de tudo é feito o repaint 
	*/
	public void desenha(){	
//		vrGAux.setColor(Color.YELLOW);
		vrGAux.fillRect(0, 0, 800, 600);
		vrFundo.desenha(vrGAux);
		for (int i = 0; i < vrInimigos.length; i++) {
			vrInimigos[i].desenha(vrGAux);
		}
		
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
		vrCSpriteMira.posX = evento.getX();
		vrCSpriteMira.posY = evento.getY();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		/** Se tiver um objeto em cima do outro ele sempre deleta o ultimo a ser inserido*/
		for (int i = vrInimigos.length -1; i >= 0; i--) {
			if(vrInimigos[i].bVisible && vrCSpriteMira.colideSprite(vrInimigos[i]) &&
					tiro){
				tiro = false;
				vrInimigos[i].bVisible = false;
				break;
			}
		}
		//som();
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void som(){
		
		//this.musica.play();
		
	}
	
	public void atualizaAnime(){
		for (int i = 0; i< vrInimigos.length; i++) {
			vrInimigos[i].atualizaAnimacao();
		}
		vrCSpriteMira.atualizaAnimacao();
		vrFundo.atualizaAnimacao();
	}
	public static void main(String[] args) {
		new CPrincipal();
	}
}
