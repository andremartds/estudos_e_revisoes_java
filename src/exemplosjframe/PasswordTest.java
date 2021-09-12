package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PasswordTest extends JFrame {
	private String senhaBanco = "123";
	private String loginBanco = "Andre";
	
	public String getLoginBanco() {
		return loginBanco;
	}

	public void setLoginBanco(String pLoginBanco) {
		this.loginBanco = pLoginBanco;
	}
	
	public String getSenhaBanco(){
		return senhaBanco;
	}
	public void setSenhaBanco(String pSenhaBanco){
		this.senhaBanco = pSenhaBanco;
	}	
	
	JButton entrar, cancel;
	JLabel login, senha;
	JTextField user;
	JPasswordField passW;
	
	public PasswordTest(){
		super("Entre com usu�rio e senha");
		Container c = getContentPane();
		
		login = new JLabel("Login...");
		senha = new JLabel("Senha...");
		
		entrar = new JButton("Entrar");
		entrar.addActionListener(new BotaoOKListener());
		
		cancel = new JButton("Cancel e Limpar");
		cancel.addActionListener(new BotaoCancelListener());
		
		user = new JTextField();
		passW = new JPasswordField();		
		
		setSize(350,150);
		setVisible(true);
		c.setLayout(new GridLayout(3,2));
		c.add(login);	
		c.add(user);
		c.add(senha);
		c.add(passW);
		c.add(entrar);
		c.add(cancel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	class BotaoOKListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = new String(passW.getPassword());
			String us = new String(user.getText());
			if(getSenhaBanco().equalsIgnoreCase(s) && getLoginBanco().equalsIgnoreCase(us)){				
				JOptionPane.showConfirmDialog(null,"entrou");
				System.out.println("seu usu�rio � "+user.getText());
				System.out.println(passW.getPassword());	
			}
			else {
				JOptionPane.showConfirmDialog(null,"Senha incorreta favor limpar o textFild");
			}
		
		}
	}
	class BotaoCancelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			user.setText("");
			passW.setText("");
			
		}
	}
	
	public static void main(String[]args){
		new PasswordTest();
	}

}
