package linguagem.threadNumeroCrescente;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumeroCrescenteFrame extends JFrame {
	/* outros labels totalmentes diferentes daqueles mas que no construtora
	 * receberao o comportamento daquele que por sinal será criado dentro de
	 * uma thread
	*/
	JLabel labelE = new JLabel();
	JLabel labelD = new JLabel();
	
	public NumeroCrescenteFrame(){
		super("Numeros crescentes");
		setLayout(new BorderLayout());
		
		/* instanciando e colocando esses dois labels com comportamento do outro do
		 * construtor
		*/
		
		
		
		Thread t1 = new Thread(new ContaImpares(labelE));
		Thread t2 = new Thread(new ContaPares(labelD));

		t1.start();
		t2.start();
	
		add(labelD, BorderLayout.WEST);
		add(labelE, BorderLayout.EAST);
		setLocation(300,70);
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {

		new NumeroCrescenteFrame();
		
	}

}
