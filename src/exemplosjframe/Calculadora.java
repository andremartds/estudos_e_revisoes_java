package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Calculadora extends JFrame implements ActionListener{
	
	JTextField operacoes;
	JButton zero;
	JButton um;
	JButton dois;
	JButton tres;
	JButton quatro;
	JButton cinco;
	JButton seis;
	JButton sete;
	JButton oito;
	JButton nove;
	JButton dividir;
	JButton somar;
	JButton subtrair;
	JButton multiplicar;
	JButton igual;
	JButton ponto;

	
	
	Calculadora(){
		super("Calculadora drem");
		Container c = getContentPane();
		
		Container principal = new JPanel();
		operacoes = new JTextField();
		zero = new JButton("0");
		zero.addActionListener(this);
		um = new JButton("1");
		um.addActionListener(this);
		dois = new JButton("2");
		dois.addActionListener(this);
		tres = new JButton("3");
		tres.addActionListener(this);
		quatro = new JButton("4");
		quatro.addActionListener(this);
		cinco = new JButton("5");
		cinco.addActionListener(this);
		seis = new JButton("6");
		seis.addActionListener(this);
		sete = new JButton("7");
		sete.addActionListener(this);
		oito = new JButton("8");
		oito.addActionListener(this);
		nove = new JButton("9");
		nove.addActionListener(this);
		dividir = new JButton("/");
		dividir.addActionListener(this);
		multiplicar = new JButton("*");
		multiplicar.addActionListener(this);
		igual = new JButton("=");
		igual.addActionListener(this);
		ponto = new JButton(".");
		ponto.addActionListener(this);
		somar = new JButton("+");
		somar.addActionListener(this);
		subtrair= new JButton("-");	
		subtrair.addActionListener(this);
		
		operacoes.setFont(new Font("serif", Font.PLAIN, 20));		
		principal.setLayout(new GridLayout(4,4,5,5));
		

		principal.add(sete);
		principal.add(oito);
		principal.add(nove);
		principal.add(dividir);

		principal.add(quatro);
		principal.add(cinco);
		principal.add(seis);
		principal.add(multiplicar);
		
		principal.add(um);
		principal.add(dois);
		principal.add(tres);
		principal.add(subtrair);
		
		principal.add(zero);
		principal.add(ponto);
		principal.add(igual);
		principal.add(somar);
		
		c.setLayout(new BorderLayout());
		
		c.add(BorderLayout.NORTH, operacoes);
		c.add(BorderLayout.CENTER, principal);
		
		setSize(250,320);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> vrCaractere = new ArrayList<String>();
		if(zero.getText()== e.getActionCommand()){
			zero.setText("0");
		} else if(um.getText() == e.getActionCommand()){
			operacoes.setText("1");
		} else if(dois.getText() == e.getActionCommand()){
			operacoes.setText("2");
		} else if(tres.getText() == e.getActionCommand()){
			operacoes.setText("3");
		} else if(quatro.getText() == e.getActionCommand()){
			operacoes.setText("4");
		} else if(cinco.getText() == e.getActionCommand()){
			operacoes.setText("5");
		} else if(seis.getText() == e.getActionCommand()){
			operacoes.setText("6");
		} else if(sete.getText() == e.getActionCommand()){
			operacoes.setText("7");
		} else if(oito.getText() == e.getActionCommand()){
			operacoes.setText("8");
		} else if(nove.getText() == e.getActionCommand()){
			operacoes.setText("9");
		} else if(dividir.getText() == e.getActionCommand()){
			operacoes.setText("/");
		} else if(multiplicar.getText() == e.getActionCommand()){
			operacoes.setText("*");
		} else if(somar.getText() == e.getActionCommand()){
			operacoes.setText("+");
		} else if(igual.getText() == e.getActionCommand()){
			operacoes.setText("=");
		}
	
	}
	
	public static void main(String[] args) {
		new Calculadora();

	}

}
