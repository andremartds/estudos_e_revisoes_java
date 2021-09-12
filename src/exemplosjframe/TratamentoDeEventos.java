package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TratamentoDeEventos extends JFrame implements ActionListener{
	JButton botao;
	TratamentoDeEventos(){
		/*chamo o construtor pai*/
		super("Tratamento de eventos ");
		/*crio um bot�o */
		botao = new JButton("Clique aqui");
		/*adiciono um evento a este bot�o referenciando esta class*/
		botao.addActionListener(this);
		/*defino um layout para meu frame no caso esse layout j� � o padr�o*/
		setLayout(new BorderLayout());
		/*adciono um bot�o ao meu panel */
		getContentPane().add(botao);
		/*Defino o tamanho deste bot�o*/
		setSize(300,300);
		/*metodo para poder fechar a janela */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Metodo para deixar a janela visivel */
		setVisible(true);
	}
	/*sobrescrita do metodo actionPerformed*/
	public void actionPerformed(ActionEvent e) {
		botao.setText("Foi clicado esse");
		
	}
	public static void main(String[] args) {
		new TratamentoDeEventos();

	}


}
