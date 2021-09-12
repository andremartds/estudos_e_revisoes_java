package linguagem.exemplosJframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExemploAulaDia11 extends JFrame {
	JPanel painelSuperior = null;
	JPanel painelInferior = null;
	JButton botaoSuperior = null;
	JButton botaoInferior = null;
	
	
	public ExemploAulaDia11(){
		super("Exemplo em sala ");
		setLayout(new BorderLayout(5,5));
		setSize(600,600);
		
		painelSuperior = new JPanel();
		painelInferior = new JPanel();
		//crio dois paineis
		painelSuperior.setLayout(new BorderLayout());
		painelInferior.setLayout(new BorderLayout());
		
		//Adiciono os paineis que criei no layout padr��o
		add(painelSuperior, BorderLayout.NORTH);
		add(painelInferior, BorderLayout.SOUTH);
		
		//bot��es
		botaoSuperior = new JButton("superior");
		botaoInferior = new JButton("inferior");
		
		//adiciona os bot��es aos paineis
		painelSuperior.add(botaoSuperior, BorderLayout.WEST);
		painelInferior.add(botaoInferior, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ExemploAulaDia11();
	}

}
