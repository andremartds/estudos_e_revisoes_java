package linguagem.numeroSorteado;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Informacoes extends JFrame implements ActionListener{
	
	JPanel painel = null;
	JToolBar toobar = null;
	JButton foto = null;
	JLabel informe = null;
	JButton voltar = null;
	JPanel painelRodape = null;
	
	public Informacoes(){
		super("informações sobre criador");
		setLayout(new BorderLayout());	
		
		/* instanciação de objetos */
		painel = new JPanel();
		painelRodape = new JPanel();
		toobar = new JToolBar();
		foto = new JButton(new ImageIcon(getClass().getResource("eu.jpg")));
		voltar = new JButton(new ImageIcon(getClass().getResource("undo.png")));
		informe = new JLabel("Jogo criado por André Martins, andremartins@outlook.com.br");
		/* fim das instanciações */
		
		/* adicionando ao toobar */
		toobar.add(foto);
		toobar.setFloatable(false);
		/* fim dos adicionamentos do toobar */
		
		/* layout paineis */
		painel.setLayout(new BorderLayout());
		painelRodape.setLayout(new BorderLayout());
		painelRodape.add(informe, BorderLayout.CENTER);
		/* fim dos adicionamentos dos paineis */
		
		/* adicionando ao painel que será adicionado ao painel principal */
		painel.add(toobar, BorderLayout.NORTH);
		painel.add(voltar, BorderLayout.EAST);
		painel.add(painelRodape, BorderLayout.CENTER);
		/* fim do adicionando painel principal */
		
		/* escutadores */
		voltar.addActionListener(this);
		/* configurações */
		add(painel);
		setSize(430, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,300);
		setResizable(false);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == voltar){
			/* chamo uma nova classe numero sorteado */
			new NumeroSorteado();
			/* fecha janela apontando para essa classe */
			this.dispose();
			
		}
	}
	public static void main(String[] args) {
		new Informacoes();
	}
}
