package exemplosjframe;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TestandoJanelas extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel far, ceu;
	JTextField farenigh, ceucios;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestandoJanelas frame = new TestandoJanelas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TestandoJanelas() {
		super("Minha primeira janela com windoBuider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton converter = new JButton("Converter");
		converter.setForeground(new Color(30, 144, 255));
		converter.addActionListener(this);
		contentPane.add(converter, BorderLayout.SOUTH);
		
		far = new JLabel("Fahenigth");
		far.setHorizontalAlignment(SwingConstants.CENTER);
		far.setForeground(new Color(0, 0, 128));
		far.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ceu = new JLabel("Ceucios");
		ceu.setHorizontalAlignment(SwingConstants.CENTER);
		ceu.setForeground(new Color(0, 0, 128));
		ceu.setFont(new Font("Tahoma", Font.PLAIN, 26));
		farenigh = new JTextField();
		farenigh.setForeground(new Color(30, 144, 255));
		farenigh.setFont(new Font("serif",Font.BOLD, 22));
		ceucios = new JTextField();
		ceucios.setForeground(new Color(30, 144, 255));
		ceucios.setFont(new Font("serif", Font.BOLD, 22));
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(far);
		panel.add(farenigh);
		panel.add(ceu);
		panel.add(ceucios);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			double entrada = Double.parseDouble(farenigh.getText());
			double saida = (entrada - 32)/1.8;
			ceucios.setText(saida+" �C");
		} catch(NumberFormatException e1){
			JOptionPane.showConfirmDialog(null,"Favor digite apenas numeros\n para conver�o");
			farenigh.setText("");
			ceucios.setText("");
		}
		
		
	}

}
