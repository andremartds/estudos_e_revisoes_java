package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,10));
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("L"));
		c.add(BorderLayout.WEST, new JButton("O"));
		setLocation(100, 100);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}
