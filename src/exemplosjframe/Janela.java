package exemplosjframe;

import javax.swing.*;

@SuppressWarnings("serial")
public class Janela extends JFrame{

	Janela(){
		/*Chama o construtor do JFrame e coloca um titulo para janela */
		super("Janela Sistema");
		/*Cria um bot�o com o nome clique no construtor */
		JButton botao = new JButton("Clique");
		/*pego o metodo contentPane e adiciono um bot�o ao mesmo */
		getContentPane().add(botao);
		/*Metodo para fechar meu frame */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Tamanho da Janela */
		setSize(500, 500);
		/*para a janela ficar vizeivel */
		setVisible(true);
	}
	
	public static void main(String[] args) {
		/*Apenas inicio o objeto Janela */
		new Janela();

	}

}
