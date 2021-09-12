package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseServer extends JFrame implements ActionListener, Runnable, 
										MouseMotionListener, KeyListener, MouseListener {
	
	
	JButton esq = null;
	ServerSocket vrServer = null;
	Socket vrCliente = null;
	DataOutputStream vrCanalsaida = null;

	
	public MouseServer() {

		super("Server");
		setLayout(new BorderLayout());
		
		esq = new JButton("Esq");
		try {
			vrServer = new ServerSocket(4050);
		}
		catch(Exception ex){
			System.out.println("fudeu");
		}
		
		//add(entrada, BorderLayout.NORTH);
		//add(vrTextoArea, BorderLayout.CENTER);
		add(esq, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/** Ouvintes */
		esq.addActionListener(this);
		esq.addKeyListener(this);
		esq.addMouseMotionListener(this);
		esq.addMouseListener(this);
		
		
		/** Thread */
		
		new Thread(this).start();;
		
	}


	@Override
	public void run() {
		try {
			vrCliente = vrServer.accept();
			vrCanalsaida = new DataOutputStream(vrCliente.getOutputStream());
		while(true){
			pausa(100);
		}
		} catch(Exception ex){}
		
	}
	void pausa(int tempo){
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	/*	try{ 
			vrCanalsaida.writeUTF(entrada.getText() + "\n");
			vrTextoArea.append(vrTextoArea.getText() + "\n");
			vrTextoArea.setText("");
		} catch(Exception exx){
		}
		*/
	}
	/** Eventos de mouse */
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	/** comandos de  teclado */

	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {
		new MouseServer();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == esq){
			System.exit(0);
		}	
	}
	@Override
	public void mousePressed(MouseEvent e) {}


	@Override
	public void mouseReleased(MouseEvent e) {}


	@Override
	public void mouseEntered(MouseEvent e) {}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
