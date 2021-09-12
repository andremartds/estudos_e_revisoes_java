package linguagem.sharedClock;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ImplementaÁ„o da classe cliente.
 * 
 * @author WENA e ANDRE
 * 
 */
public class Cliente extends JFrame implements Runnable, ActionListener {
	JPanel painel = null;
	JPanel painelB = null;
	JButton reset = null;
	JButton maisHora = null;// + da hora
	JButton menosHora = null;// - da hora
	JButton maisMinuto = null;// + do minuto
	JButton menosMinuto = null;// -do minuto
	JLabel labelH = null;// label da hora
	JLabel labelM = null;// label do minuto
	Socket cliente = null;
	DataInputStream canalEntrada = null;
	DataOutputStream canalSaida = null;
	int reseteAux;
	int maisHoraAux;
	int menosHoraAux;
	int maisMinutoAux;
	int menosMinutosAux;
	int menosMinutoAux;
	// Construtor
	public Cliente() {
		setSize(800, 600);
		setTitle("Cliente");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// InstanciaÁ„o e atribuiÁ„o de valor aos objetos
		painel = new JPanel();
		painelB = new JPanel();
		maisHora = new JButton("+");
		menosHora = new JButton("-");
		maisMinuto = new JButton("+");
		menosMinuto = new JButton("-");
		labelH = new JLabel("Horas");
		labelM = new JLabel("Minutos");

		try {
			cliente = new Socket("127.0.0.1", 4050);
			canalSaida = new DataOutputStream(cliente.getOutputStream());
			canalEntrada = new DataInputStream(cliente.getInputStream());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Atribui os objetos ao painel
		painel.add(labelH);
		painel.add(maisHora);
		painel.add(menosHora);
		painel.add(labelM);
		painel.add(painelB);
		painelB.add(maisMinuto);
		painelB.add(menosMinuto);

		// Adicionando painel ‡s regiıes
		add(painel, BorderLayout.CENTER);
		// add(painelB, BorderLayout.CENTER);

		// Instanciando e adicionando o painel ‡ sua regi„o
		reset = new JButton("RESET");
		painel.add(reset, BorderLayout.SOUTH);

		// Adicionando tÌtulo ao painel
		painel.setBorder(BorderFactory.createTitledBorder(" SHARED CLOCK "));

		Thread vrThread = new Thread(this);
		vrThread.start();

		// Registra o tratador de eventos
		reset.addActionListener(this);
		maisHora.addActionListener(this);
		menosHora.addActionListener(this);
		maisMinuto.addActionListener(this);
		menosMinuto.addActionListener(this);

		// Janela visivel
		setVisible(true);
	}

	@Override
	public void run() {

		while (true) {
			try {
				pausa(10);

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {

		}
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == reset) {
				reseteAux = 0;
			try {
				canalSaida.writeInt(reseteAux);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		if (evento.getSource() == maisHora) {
				maisHoraAux = 1;
			try {
				canalSaida.writeInt(maisHoraAux);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		} 
		if (evento.getSource() == menosHora) {
				menosHoraAux = 2;
			try {
				canalSaida.writeInt(menosHoraAux);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		} 
		if (evento.getSource() == maisMinuto) {
			maisMinutoAux = 3;
			try {
				canalSaida.writeInt(maisMinutoAux);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		} 
		if (evento.getSource() == menosMinuto) {
			menosMinutoAux = 4;
			try {
				canalSaida.writeInt(menosMinutoAux);
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		}
		

	}

	public static void main(String[] args) {
		new Cliente();
	}

}
