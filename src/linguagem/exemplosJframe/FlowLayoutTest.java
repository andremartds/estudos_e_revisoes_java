package linguagem.exemplosJframe;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutTest extends JFrame{
	
	public FlowLayoutTest(){
		super("teste FlowLayout");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JButton("teste"));
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FlowLayoutTest();

	}

}
