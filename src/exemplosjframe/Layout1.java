package exemplosjframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Layout1 extends JFrame{
	
	public Layout1(){
		super("Janela 1");
		Container c = getContentPane();		
		c.setLayout(new BorderLayout(7,7));		
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("L"));
		c.add(BorderLayout.WEST, new JButton("O"));
		
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public static void main(String[] args) {
		new Layout1();

	}

}
