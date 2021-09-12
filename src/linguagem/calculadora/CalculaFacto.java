package linguagem.calculadora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculaFacto extends JFrame {
	
	JPanel paneltopo = null;
	JPanel panelCenter = null;
	JButton[] vetButon = new JButton[16];
	JTextField caracteres = null;
	String[] textoBotoes = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	Acoes acoes = null;
	public CalculaFacto(){
		super(" calc facto ");
		panelCenter = new JPanel(new GridLayout(4, 4));
		paneltopo = new JPanel();
		
		for (int i = 0; i < vetButon.length; i++) {
			vetButon[i] = new JButton(textoBotoes[i]);
			panelCenter.add(vetButon[i]);
			
		}
		
		// Representa o endere???o dessa classe para a outra classe conseguir acessar os bot???es
		acoes = new Acoes(this);		
		
		caracteres = new JTextField();
		caracteres.setHorizontalAlignment(JTextField.RIGHT);
		caracteres.setFont(new Font("Serif", Font.BOLD, 20));
		
		setLayout(new BorderLayout());		
		
		setLocation(450,300);
		add(panelCenter);
		add(BorderLayout.NORTH,caracteres);
		
		setSize(270,230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new CalculaFacto();
	}

}
