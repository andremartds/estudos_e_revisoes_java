package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Janela01 extends JFrame{
	JLabel texto = new JLabel("todo texto aqui");
	BorderLayout borderLayout;
	Janela01(){
		super("01");
		Container c = getContentPane();
		borderLayout = new BorderLayout(5,5);
		c.setLayout(borderLayout);
		add(new JButton("um"));
		add(new JButton("dois"));
		add(new JButton("tres"));
		add(new JButton("quatro"));
		add(new JButton("cinco"));
		texto.setText("Novo texto");
		add(texto);
		texto.setBackground(Color.BLUE);
		texto.setFont(new Font("ARIAL",Font.BOLD, 30));
		add(new JTextField(100));
		//setLayout(new FlowLayout());
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Janela01();

	}

}
