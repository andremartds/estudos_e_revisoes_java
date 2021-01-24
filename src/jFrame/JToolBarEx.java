package jFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class JToolBarEx  extends JFrame implements ActionListener{
	JPanel painel1 = null;
	JToolBar toobar = new JToolBar();
	JMenuBar menuBar = null;
	JMenu arquivo = null;
	JMenu editar = null;
	JMenu ajuda = null;
	JMenu fonte = null;
	
	JMenuItem novo = null;
	JMenuItem salvar = null;
	JMenuItem sair = null;
	JMenuItem arial = null;
	JMenuItem verdana = null;
	JMenuItem azul = null;
	JMenuItem preto = null;
	JMenuItem sobre = null;
	
	JButton botaoOpen = null;
	JButton botaoSave = null;
	JButton botaoUndo = null;
	JButton botaoRedo = null;
	JButton botaoHelp = null;
	
	
	public JToolBarEx(){
		super("janela VEA do ANDRÉ");
		setLayout(new BorderLayout());
		/* Instanciando de objetos */
		BorderLayout border = new BorderLayout();
		painel1 = new JPanel();
		toobar = new JToolBar();
		menuBar = new JMenuBar();
		botaoOpen = new JButton(new ImageIcon(getClass().getResource("open.png")));
		botaoSave = new JButton(new ImageIcon(getClass().getResource("save.png")));
		botaoUndo = new JButton(new ImageIcon(getClass().getResource("undo.png")));
		botaoRedo = new JButton(new ImageIcon(getClass().getResource("redo.png")));
		botaoHelp = new JButton(new ImageIcon(getClass().getResource("symbol_help.png")));
	
		arquivo = new JMenu("Arquivo");
		
		editar = new JMenu("editar");
		ajuda = new JMenu("Ajuda ?");
		fonte = new JMenu("Fonte");
		
		novo = new JMenuItem("Novo");
		salvar = new JMenuItem("Salvar");
		sair = new JMenuItem("Sair");
		arial = new JMenuItem("Arial");
		verdana =new JMenuItem("Verdana");
		azul = new JMenuItem();
		preto = new JMenuItem();
		sobre = new JMenuItem();
		
		/* *************************************************************************************************/
		
		/* adicionando componentes */

		this.setJMenuBar(menuBar);
		menuBar.add(arquivo);
		menuBar.add(editar);
		menuBar.add(ajuda);
	
		arquivo.add(novo);
		arquivo.add(salvar);
		arquivo.addSeparator();
		arquivo.add(sair);
		editar.add(fonte);
		fonte.add(arial);
		fonte.add(verdana);
		toobar.add(botaoOpen);
		toobar.add(botaoSave);
		toobar.add(botaoUndo);
		toobar.add(botaoRedo);
		toobar.setFloatable(false);
	//	toobar.setOrientation(JToolBar.VERTICAL);
		add(toobar, BorderLayout.NORTH);
			
	
		/* registrando */
		sair.addActionListener(this);
		/* fim dos metodos registrados */
		
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JToolBarEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sair){
			System.exit(0);
		}
		
	}
}

