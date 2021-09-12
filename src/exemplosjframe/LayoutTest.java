package exemplosjframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LayoutTest extends JFrame{
	public LayoutTest(){
		super("...Layout...");
		Container cont = new Container();
		cont = getContentPane();
		cont.add(BorderLayout.NORTH, new JButton("Bot�o 1"));
		cont.add(BorderLayout.SOUTH, new JButton("Bot�o 2"));
		cont.add(BorderLayout.CENTER, new JButton("Bot�o centro"));
		cont.add(BorderLayout.EAST, new JButton("Bot�o 3"));
		cont.add(BorderLayout.WEST, new JButton("Bot�o 4"));
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new LayoutTest();

	}

}
