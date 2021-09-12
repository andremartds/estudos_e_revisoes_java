package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class CheqBoxTest extends JFrame {
	
	JCheckBox bold;
	JCheckBox italic;
	JTextField frase;
	CheqBoxTest(){
		super("CheckBox");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		bold = new JCheckBox("Bold");
		bold.addItemListener(new Negrito());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new Italico());
		frase = new JTextField("Texto aqui ",26);
		
		c.add(frase);
		c.add(bold);
		c.add(italic);		
		
		setSize(300,300);
		setVisible(true);
	}
	class Negrito implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			frase.setFont(new Font("Serif",Font.PLAIN, 24));		
		}
		
	}

	class Italico implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {			
			frase.setFont(new Font("Serif", Font.BOLD, 26));
		}
		
	}
	public static void main(String[] args) {
		new CheqBoxTest();

	}

}
