package linguagem.exemplosJframe;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	int x, y;
	Janela(int x, int y){
		super("01");
		setLocation(x,y);
		setSize(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Janela(100,100).getContentPane().setBackground(Color.RED);
		new Janela(200,100).getContentPane().setBackground(Color.BLACK);
		new Janela(100,200).getContentPane().setBackground(Color.BLUE);
		new Janela(200,200).getContentPane().setBackground(Color.CYAN);
	}
}
