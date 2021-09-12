package linguagem.chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame implements ActionListener, Runnable{

	JTextArea vrTextoArea = null;
	JTextField entrada = null;
	JButton btOk = null;
	Socket vrCliente = null;
	DataOutputStream canalSaida = null;
	DataInputStream vrCanalEntrada = null;

	
	public ChatCliente() {

		super("Chat Cliente");
		setLayout(new BorderLayout());
		
		/** Instancio os objetos */
		vrTextoArea = new JTextArea();
		entrada = new JTextField();
		btOk = new JButton("OK");
		
		/** Adiciono a janela */
		add(entrada, BorderLayout.NORTH);
		add(vrTextoArea, BorderLayout.CENTER);
		add(btOk, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
			vrCliente = new Socket("127.0.0.1", 4050);
		} catch(Exception ex){
			System.out.println("fudeu");
		}
		
		/** ouvinte*/
		btOk.addActionListener(this);
		
		
		/** minha thread da propria classe */
		new Thread(this).start();;
		
	}

	/** Metodo da Thread para rodala */
	@Override
	public void run() {
		try {
			canalSaida = new DataOutputStream(vrCliente.getOutputStream());
			vrCanalEntrada = new DataInputStream(vrCliente.getInputStream());
		while(true){
			String mensagem = vrCanalEntrada.readUTF();
			vrTextoArea.append(mensagem);
			pausa(100);
		}
		} catch(Exception c){}
		
	}
	/** metodo para tempo pausa */
	void pausa(int tempo){
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**   */
	@Override
	public void actionPerformed(ActionEvent e) {
		try{ 
			canalSaida.writeUTF(entrada.getText() + "\n");
			vrTextoArea.append(vrTextoArea.getText() + "\n");
			vrTextoArea.setText("");
		} catch(Exception exx){
		}
	}
	/** Main para iniciar */
	public static void main(String[] args) {
		new ChatCliente();
	}

}
