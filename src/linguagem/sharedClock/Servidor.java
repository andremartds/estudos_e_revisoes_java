package linguagem.sharedClock;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Servidor extends JFrame implements Runnable{
	
	JLabel label = new JLabel();
	int contador = 1;
	String hora;
	String minuto = "";
	String segundo = "";
	ServerSocket servidor = null;
	Socket cliente = null;
	DataOutputStream canalSaida = null;
	DataInputStream canalEntrada = null;
	int armazenaEntrada;
	int maisHora;
	boolean verdadeiro = false;
	int horaAux = 0;
	int minutoAux = 0;
	int segundoAux = 0;
	int novahora;
	
	public Servidor(){
		super("Cronometro ");
		
		try {
			servidor = new ServerSocket(4050);
		}
		catch(Exception ex) {	
		}
		
		setLayout(new BorderLayout());
		Thread t1 = new Thread(this);
		t1.start();
		add(label, BorderLayout.CENTER);
		setLocation(940,25);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void pegaHora() {
		novahora = Integer.parseInt(hora);
		
	}
	
	public void run() {
		try {
			cliente = servidor.accept();
			canalSaida = new DataOutputStream(cliente.getOutputStream());
			canalEntrada = new DataInputStream(cliente.getInputStream());
		} catch (Exception ex){}
		while(true){
				String aux = (new SimpleDateFormat("H:m:s").format(new Date()));
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
           
           String[] token = aux.split(":");
          for (int i = 0; i < token.length; i++) {
        	  hora = token[0];
        	  minuto = token[1];
        	  segundo = token[2];
			
		} 
          label.setText(novahora + " : " + minutoAux + " : "+ segundo );
          label.setFont(new Font("verdana", Font.BOLD, 30));
      	
          try {
        	  armazenaEntrada = canalEntrada.readInt();
			System.out.println(armazenaEntrada);
		} catch (IOException e) {
			e.printStackTrace();
		}
			if(armazenaEntrada == 0) {
				label.setText("00 : 00 : 00");
				label.setFont(new Font("verdana", Font.BOLD, 30));
				
			} 
			if(armazenaEntrada == 1){
				
					if(verdadeiro == false) {
						novahora = Integer.parseInt(hora);
						verdadeiro = true;
					} 
					while(verdadeiro) {
							novahora = novahora + 1;
							hora = Integer.toString(novahora);
							if(armazenaEntrada != 1){
								verdadeiro = false;
					}
					}
				}
			
			if(armazenaEntrada == 2){	
				//novahora = Integer.parseInt(hora);
				novahora = novahora - 1;
				hora = Integer.toString(novahora);
			}
			if(armazenaEntrada == 3){
				//minutoAux = Integer.parseInt(minuto);
				minutoAux = minutoAux + 1;
				minuto = Integer.toString(minutoAux);

			}
			if(armazenaEntrada == 4){
				//minutoAux = Integer.parseInt(minuto);
				minutoAux = minutoAux - 1;
				minuto = Integer.toString(minutoAux);
			}
			else {
	         
			}
			verdadeiro = false;
		}
		
	}
	/*  */
	void pause(){
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new Servidor();
	}

}

