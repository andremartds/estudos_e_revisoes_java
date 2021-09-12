package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AulaDia25 extends JFrame implements ActionListener, MouseListener, MouseMotionListener, KeyListener{
	JPanel painelInferior = null;
	JPanel lateralEsquerda = null;
	JButton botao = null;
	JLabel escrita = null;
	JTextField texto = null;
	BorderLayout border = null;
	
	public AulaDia25(){
		super("Faculade Catolica aula dia 25");
		border = new BorderLayout();
		setLayout(border);
		
		painelInferior = new JPanel();
		lateralEsquerda = new JPanel();
		texto = new JTextField(10);
		escrita = new JLabel("Nome");
		botao = new JButton("Bot��o");
		botao.addActionListener(this);
		
		lateralEsquerda.setLayout(new GridLayout(5,2));
		lateralEsquerda.add(escrita);
		lateralEsquerda.add(texto);

		
		painelInferior.setLayout(new BorderLayout());
		painelInferior.add(botao, BorderLayout.EAST );
		
		add(painelInferior, BorderLayout.SOUTH);
		add(lateralEsquerda, BorderLayout.WEST);
		
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setVisible(true);
		this.requestFocus();
	}
	
	
	/* botao clicado */
	public void mouseClicked(MouseEvent e) {
		escrita.setText("Mouse Clicked");
	}
	/* Botao Pressionado */
	public void mousePressed(MouseEvent e) {
		escrita.setText(" Mouse Pressed ");
		
	}
	/*  */
	public void mouseReleased(MouseEvent e) {
		escrita.setText(" Mouse Released");
		
	}
	//
	public void mouseEntered(MouseEvent e) {
		escrita.setText(" mouse Entered ");
	}
	//saindo para fora da area da janela
	public void mouseExited(MouseEvent e) {
		escrita.setText(" Mouse Exited");		
	}
	//
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao){
			escrita.setText("Bot��o Foi Pressionado");
		}
		
	}


	//movimento de mouse sendo pressionado
	public void mouseDragged(MouseEvent e) {
		escrita.setText(e.getX() + " " + e.getX());		
	}


	//movimento de mouse sendo passado por cima
	public void mouseMoved(MouseEvent e) {
		escrita.setText(e.getX() + " " + e.getX());	
		
	}
	
	public static void main(String[] args) {
		new AulaDia25();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			JOptionPane.showConfirmDialog(null, "Tu Cliko");
			System.exit(1);
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
