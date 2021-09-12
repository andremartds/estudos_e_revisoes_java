package linguagem.exemplosJframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha extends JFrame implements ActionListener {
	JPanel panelCenter = null;
	JPanel painelBordas = null;
	JButton[] vetButon = new JButton[9];

	public JogoDaVelha() {
		painelBordas = new JPanel();
		panelCenter = new JPanel();

		for (int i = 0; i < vetButon.length; i++) {
			vetButon[i] = new JButton(".");
			panelCenter.add(vetButon[i]);
			vetButon[i].addActionListener(this);
		}
		GridLayout grade = new GridLayout(3, 3);
		panelCenter.setLayout(grade);

		painelBordas.setLayout(new BorderLayout());
		// painelBordas.add(new JButton(), BorderLayout.WEST);
		painelBordas.add(new JButton(), BorderLayout.SOUTH);
		// painelBordas.add(new JButton(), BorderLayout.NORTH);
		// painelBordas.add(new JButton(), BorderLayout.EAST);
		painelBordas.add(panelCenter, BorderLayout.CENTER);

		add(painelBordas);
		setLocation(500, 250);
		setSize(250, 230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean jogador1 = true;
		boolean jogador2 = false;
		String jogadorAtivo = "";

		if (jogador1 == true && jogador2 == false) {
			for (int i = 0; i < vetButon.length; i++) {
				for (int j = 0; j < vetButon.length; j++) {
					if (e.getSource() == vetButon[i]) {
						vetButon[i].setText("X");
					}

					jogador1 = false;
					jogador2 = true;
					for (int j2 = 0; j2 < vetButon.length; j2++) {
						if (jogador1 == false && jogador2 == true) {
							if (e.getSource() == vetButon[i]) {
								vetButon[i].setText("0");
							}
						}

					}
					jogador1 = true;
					jogador2 = false;
				}
			}

		}

	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}

}
