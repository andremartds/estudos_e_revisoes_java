package exemplosjframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LabelTest extends JFrame {
	JButton botao;
	JLabel lab;
	LabelTest(){
		/*Construtor sobrescrito */
		super("entrada de Labels");
		/*Definindo uma font com estilo de tamanho */
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC,26);
		/*criei uma nova label */
		JLabel fonte1 = new JLabel("meu label 1");
		fonte1.setToolTipText("Novo texto");
		/*Definindo a cor da fonte */
		fonte1.setForeground(Color.GRAY);
		/*Definindo o estilo da Fonte*/
		fonte1.setFont(fonte);
		/*Novo label */
		lab = new JLabel("texto inserido");		
		/*Descri��o quando se passa por cima como se fosse o hover do css*/
		lab.setToolTipText("Descri��o");
		
		ImageIcon ico = new ImageIcon(getClass().getResource("imagens/android.png"));		
		JLabel imag = new JLabel(ico);
		/*Adiciono o meu panel ao container*/
		Container c = getContentPane();
		/*Defino o Layout como livre */
		c.setLayout(new FlowLayout());
		/*Apenas add a Label */
		c.add(lab);
		c.add(fonte1);
		c.add(imag);
		
		
		
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LabelTest();

	}

}
