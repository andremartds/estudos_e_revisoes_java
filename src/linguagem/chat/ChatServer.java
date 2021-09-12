package linguagem.chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatServer extends JFrame implements ActionListener, Runnable{

	JTextArea vrTextoArea = null;
	JTextField entrada = null;
	JButton btOk = null;
	ServerSocket vrServer = null;
	Socket vrCliente = null;
	DataInputStream vrCanalEntrada = null;
	DataOutputStream vrCanalsaida = null;

	
	public ChatServer() {

		super("Chat Server");
		setLayout(new BorderLayout());
		
		vrTextoArea = new JTextArea();
		entrada = new JTextField();
		btOk = new JButton("OK");
		try {
			vrServer = new ServerSocket(4050);
		}
		catch(Exception ex){
			System.out.println("fudeu");
		}
		
		add(entrada, BorderLayout.NORTH);
		add(vrTextoArea, BorderLayout.CENTER);
		add(btOk, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btOk.addActionListener(this);
		
		
		/** */
		
		new Thread(this).start();;
		
	}


	@Override
	public void run() {
		try {
			vrCliente = vrServer.accept();
			vrCanalEntrada = new DataInputStream(vrCliente.getInputStream());
			vrCanalsaida = new DataOutputStream(vrCliente.getOutputStream());
		while(true){
			String mensagem = vrCanalEntrada.readUTF();
			vrTextoArea.append(mensagem);
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
		try{ 
			vrCanalsaida.writeUTF(entrada.getText() + "\n");
			vrTextoArea.append(vrTextoArea.getText() + "\n");
			vrTextoArea.setText("");
		} catch(Exception exx){
		}
		
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}
