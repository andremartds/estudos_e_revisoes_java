package linguagem.cronometro;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumeroCrescenteFrame extends JFrame {
	/* outros labels totalmentes diferentes daqueles mas que no construtora
	 * receberao o comportamento daquele que por sinal será criado dentro de
	 * uma thread
	*/
	JLabel label = new JLabel();
	
	public NumeroCrescenteFrame(){
		super("Numeros crescentes");
		setLayout(new BorderLayout());
	
		Thread t1 = new Thread(new ThreadTotal(label));

		t1.start();
		add(label, BorderLayout.CENTER);
		setLocation(940,25);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {

		new NumeroCrescenteFrame();
		
	}

}
