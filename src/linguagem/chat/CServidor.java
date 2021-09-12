package linguagem.chat;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class CServidor extends JFrame implements Runnable, MouseMotionListener, KeyListener
{
	ServerSocket vrServidor = null;
	Socket vrCliente = null;
	DataOutputStream vrCanalSaida = null;
	int x, y;
	
	//Construtor da classe
	public CServidor()
	{
		//Configuracao de janela
		setTitle("Servidor");
		setSize(500,300);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria o objeto que abre a conexao com o servidor
		try
		{
			vrServidor = new ServerSocket(4050);
		}
		catch(Exception ex)
		{	
		}
		
		//Registra ao tratador de eventos
		addMouseMotionListener(this);
		addKeyListener(this);
		
		//Dispara a thread
		new Thread(this).start();

		
		//Mostra a janela
		setVisible(true);
	}
	
	//Metodo da interface Runnable
	public void run()
	{
		try
		{
			vrCliente = vrServidor.accept();
			vrCanalSaida = new DataOutputStream(vrCliente.getOutputStream());
		
		
			while(true)
			{
				try {
					vrCanalSaida.writeInt(x);
					vrCanalSaida.writeInt(y);
				} catch (Exception ex) {
				}
				pausa(50);
			}
		}
		catch(Exception excecao)
		{}
	}
	
	//Metodo utilizado para pausar a Thread
	public void pausa(int tempo)
	{
		try
		{
			Thread.sleep(tempo);
		}
		catch(Exception vrException)
		{
			
		}
	}
	
	//Metodo principal do programa Java
	public static void main(String[] args) 
	{
		new CServidor();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			try {
				vrCanalSaida.writeInt(KeyEvent.VK_ESCAPE);
			} catch (Exception ex) {
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			try {
				vrCanalSaida.writeInt(KeyEvent.VK_ESCAPE);
				System.exit(0);
			} catch (Exception ex) {
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
