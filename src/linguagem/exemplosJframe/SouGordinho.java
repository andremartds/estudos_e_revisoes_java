package linguagem.exemplosJframe;

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

public class SouGordinho extends JFrame implements ActionListener{
	JPanel painel01, painel02, painel03 =null;
	Float pesoF = 0F, alturaF = 0F;
	JButton bt01 , bt02, bt03= null;
	JTextField altura, peso = null;
	JLabel alt, pes, resultado = null;

	
	public SouGordinho() {
		super("Sou gordinho?");
		setLayout(new BorderLayout());
		
		//inicia������o dos objetos
		painel01 = new JPanel();
		painel02 = new JPanel();
		painel03 = new JPanel();
		//bot���es
		bt01 = new JButton("Resultado");
		bt02 = new JButton("sair");
		bt03 = new JButton("Limpar campos");
		altura = new JTextField();
		peso = new JTextField();
		
		resultado = new JLabel();
		alt = new JLabel("Digite sua altura");
		pes = new JLabel("Digite seu peso");
		
		resultado.setText("O resultado e ");
		
		
		painel01.setLayout(new BorderLayout());
		painel01.add(bt01, BorderLayout.EAST);
		painel01.add(bt02, BorderLayout.WEST);
		painel01.add(bt03, BorderLayout.CENTER);
		
		painel02.setLayout(new GridLayout(2,2));
		painel02.add(alt);
		painel02.add(altura);
		painel02.add(pes);
		painel02.add(peso);
		
		painel03.setLayout(new BorderLayout());
		painel03.add(resultado, BorderLayout.EAST);
		painel03.add(painel02, BorderLayout.SOUTH);
		
		//ouvintes
		bt01.addActionListener(this);
		bt02.addActionListener(this);
		bt03.addActionListener(this);
		
		
		
		//adicionando os componentes
		add(painel01, BorderLayout.SOUTH);
		add(painel03,BorderLayout.WEST);
		
		//configura������es padr���es para implementa������o de um jFrame
		//setResizable(false);
		setLocation(300,70);
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//come���o do tratamento das exeptions
		boolean continua = true;
		while(continua != false){
			try{
				pesoF = Float.parseFloat(peso.getText());
				alturaF = Float.parseFloat(altura.getText());
				pesoF = pesoF / (alturaF * alturaF);			
			}catch(ArithmeticException e1){
				JOptionPane.showConfirmDialog(null,"Digite caracteres validos (numeros equivalentes a \n Centimetros e Quilos )");
				altura.setText("");
				peso.setText("");
				continua = true;
			} catch(NumberFormatException e2){
				JOptionPane.showConfirmDialog(null,"Digite caracteres validos (numeros equivalentes a \n Centimetros e Quilos )");
				altura.setText("");
				peso.setText("");
				continua = true;
			}
			continua = false;
		}
		// fim das exceptions 
		if(e.getSource() == bt01){			
			if(pesoF < 20){				
				resultado.setText("Seu indice ��� =  " +pesoF +" voc��� est��� abaixo do peso");
			}
			else if(pesoF > 20 && pesoF < 25){
				resultado.setText("Seu indice ��� =  "+ pesoF +" voc��� est��� com peso ideal");
			}
			else if(pesoF > 25 && pesoF < 30){
				resultado.setText("Seu indice ��� =  "+ pesoF +" voc��� est��� com sobrepeso");
			}
			else if(pesoF > 30 && pesoF < 35){
				resultado.setText("Seu indice ��� =  "+ pesoF +" voc��� est��� com obesidade moderada");
			}
			else if(pesoF > 35 && pesoF < 40){
				resultado.setText("Seu indice ��� =  " +pesoF +" Obesidade severa");
			}
			else if(pesoF > 40 && pesoF < 50){
				resultado.setText("Seu indice ��� =  "+ pesoF +" voc��� est��� com obesidade morbida");
			}
			else if(pesoF > 50){
				resultado.setText("Seu indice ��� =  "+ pesoF +" voc��� est��� com super obesidade");
			}
			else{
				resultado.setText("Seu indice ��� =  "+ pesoF + "Valor n���o encontrado");
			}
			
		}
		if(e.getSource() == bt02){
			System.exit(0);
		}
		if(e.getSource() == bt03){
			altura.setText("");
			peso.setText("");
		}		
		
	}
	
	public static void main(String[] args) {
		new SouGordinho();
	}


}
