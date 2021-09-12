package exemplosjframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TestFlowLayout extends JFrame {

	public TestFlowLayout() {
		super("************FlowLayout***************");
		/*pega o pane e add ao obj cont*/
		Container cont = getContentPane();
		/*add ao layout autom�tico */
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("teste"));
		cont.add(new JButton("teste1"));
		cont.add(new JButton("teste2"));
		cont.add(new JButton("teste3"));
		cont.add(new JButton("teste4"));
		cont.add(new JButton("teste5"));
		
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestFlowLayout();

	}

}
