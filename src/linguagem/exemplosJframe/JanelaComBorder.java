package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JanelaComBorder extends JFrame {
	JPanel painelInferior = null;
	JPanel lateralEsquerda = null;
	JButton botao = null;
	
	JLabel escrita = null;
	JLabel escrita1 = null;
	JLabel escrita2 = null;
	JLabel escrita3 = null;
	JLabel escrita4 = null;
	JTextField texto = null;
	JTextField texto1 = null;
	JComboBox<String> combo = null;
	JTextField texto3 = null;
	JTextField texto4 = null;
	BorderLayout border = null;

	
	
	public JanelaComBorder() {
		super("exerciocio");
		border = new BorderLayout();
	
		setLayout(border);
		setSize(500, 200);
		
		painelInferior = new JPanel();
		lateralEsquerda = new JPanel();
		texto = new JTextField(10);
		texto1 = new JTextField();
		combo = new JComboBox<String>();
		texto3 = new JTextField();
		texto4 = new JTextField();
		escrita = new JLabel("Nome");
		escrita1 = new JLabel("Nome");
		escrita2 = new JLabel("Nome");
		escrita3 = new JLabel("Nome");
		escrita4 = new JLabel("Nome");
		botao = new JButton("Bot��o de baixo");
		
		lateralEsquerda.setLayout(new GridLayout(5,2));
		lateralEsquerda.add(escrita);
		lateralEsquerda.add(texto);
		lateralEsquerda.add(escrita1);
		lateralEsquerda.add(texto1);
		lateralEsquerda.add(escrita2);
		lateralEsquerda.add(combo);
		lateralEsquerda.add(escrita3);
		lateralEsquerda.add(texto3);
		lateralEsquerda.add(escrita4);
		lateralEsquerda.add(texto4);
		
		painelInferior.setLayout(new BorderLayout());
		painelInferior.add(botao, BorderLayout.EAST );
		
		add(painelInferior, BorderLayout.SOUTH);
		add(lateralEsquerda, BorderLayout.WEST);
		
		
		
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JanelaComBorder().getContentPane().setBackground(Color.RED);
	}

}
