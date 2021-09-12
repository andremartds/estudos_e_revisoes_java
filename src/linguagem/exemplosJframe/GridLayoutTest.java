package linguagem.exemplosJframe;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GridLayoutTest extends JFrame{
	
	public GridLayoutTest(){
		super("Testando o grid Layout");
		Container c = getContentPane();
		setSize(800, 500);
		setLocation(100,100);
		setResizable(false);
		c.setLayout(new GridLayout(3,2));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
