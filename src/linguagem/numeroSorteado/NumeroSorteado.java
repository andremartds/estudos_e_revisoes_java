package linguagem.numeroSorteado;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumeroSorteado extends JFrame implements ActionListener{
	JButton novo = null;
	JButton informacoes = null;
	JButton acerte = null;
	JPanel painel1 = null;
	JPanel painel2 = null;
	JPanel painel3 = null;
	JPanel painel4 = null;
	JLabel label = null;
	JTextField texto = null;
	int valor;
	int[] vet = new int[10];
	public NumeroSorteado(){
		/* titulo da janela*/
		super("Acerte o Numero de zero a 100");
		/* valor randomico */
		valor = 1+(int)(Math.random()*100);
		/* tipo de layout de fundo */
		setLayout(new BorderLayout());
		/* instanciacao de objetos */
		informacoes = new JButton(" ? ");
		novo = new JButton("Novo jogo");
		acerte = new JButton("Acerte :)");
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();
		label = new JLabel();
		texto = new JTextField();
		painel1.setLayout(new GridLayout(1,1));
		painel2.setLayout(new BorderLayout());
		painel3.setLayout(new BorderLayout());
		/* Fim da stanciação dos objetos */
		
		/* algumas regras para mudancas de componentes */
		
		label.setText("<<<< ? >>>>");
		
		/* fim das regras de mudanças de componentes */
		
		/* adicionando tudo aos paineis */
		painel1.add(novo);
		painel1.add(informacoes);
		
		painel2.add(label, BorderLayout.NORTH);
		painel2.add(texto, BorderLayout.CENTER);
		painel2.add(acerte, BorderLayout.SOUTH);
		
		painel4.add(painel2);
		
		painel3.add(painel1, BorderLayout.NORTH);
		
		painel3.add(painel4, BorderLayout.CENTER);
		
		/* finalizando o adicionamento aos paineis */
		
		/* escutadores */
		
		acerte.addActionListener(this);
		texto.addActionListener(this);
		novo.addActionListener(this);
		informacoes.addActionListener(this);
		
		/* fim dos escutadores */
		
		add(painel3);
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,300);
		setResizable(false);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		System.out.println(valor);
		if(evento.getSource() == acerte){
			
			if(texto.getText().equals("")){
				JOptionPane.showConfirmDialog(null, "por favor coloque primeiro os caracteres");
			}
			
			/* pegando o que tem dentro do getText */
			String auxText = texto.getText();
			texto.setText("");
			
			/* Pegando o valor randomico gerado */
			Integer valorRandon = valor;
			
			/* Convertendo valor do TextFild */
			Integer valorDoJtexfild = Integer.parseInt(auxText);
			
			/* Comparando se o valor random é maior ou menor */
			if(valorRandon > valorDoJtexfild){
				label.setText("O numero MAIOR");
			} else{
				label.setText("O numero MENOR");
			}
			/* Comparando se for igual ele muda o label */
			if(valorRandon == valorDoJtexfild){
				label.setText(" ACERTOU _o/");
			}
			
		}
		/* se o botão clicado for o novo um novo jogo é gerado */
		if(evento.getSource() == novo){
			valor = 1+(int)(Math.random()*10);
			label.setText("<<<< ? >>>>");
		}
		if(evento.getSource() == informacoes){
			new Informacoes();
		}
		
	}
	
	public static void main(String[] args) {
		new NumeroSorteado();
	}
}
