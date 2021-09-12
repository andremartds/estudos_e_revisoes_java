package exemplosjframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Interface1 extends JFrame{
	Interface1(){
		super("Painel...");
		/*criei um container e add meu panel principal*/
		Container c = getContentPane();
		/*Criei outro container */
		Container c1 = new JPanel();
		/*Para esse container add um gridLayout com 5 linhas e 1 coluna */
		c1.setLayout(new GridLayout(5,1));
		/*depois adcionei os bot�es */
		c1.add(new JButton("Ok"));
		c1.add(new JButton("Help"));
		c1.add(new JButton("Cancel"));
		c1.add(new JButton("Sair"));
		c1.add(new JButton("Help"));
		/*depois adcionei um border layour ao centro*/
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		/*e add meus bot�es a direita do meu container */
		c.add(BorderLayout.EAST, c1);
		
		
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Interface1();

	}

}
