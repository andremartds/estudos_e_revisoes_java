package linguagem.A1;

/***************************************
 * Projeto: CalcConsumo
 * Descricao: projeto destinado ao calculo de consumo de combustivel
 * Data: 08/04/2014
 * Autor: André Martins
 * 
 * algumas definições do projeto
 * Carros a gasolina fazem 10km com um litro
 * Carros a alcool fazem 20Km com um litro
 * Carros a Diesel fazem 5Km com um litro
 * 
 ***************************************/

//Pacotes utilizados
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class CCalculaConsumo extends JFrame implements ActionListener {
	// Atributos da classe
	private Double aux;
	private String armazenaJtext;
	Double converteEguardaJtext = 0.0;
	private JPanel vrPainelNorte = null;
	private JPanel vrPainelSul = null;
	private JPanel vrPainelOeste = null;

	private JButton vrBotao = null;
	private JButton informacoes = null;

	private JLabel vrLabelKm = null;
	private JLabel vrLabelRes = null;

	private JTextField vrTextField = null;

	private JRadioButton vrRadioGas = null;
	private JRadioButton vrRadioAlc = null;
	private JRadioButton vrRadioDies = null;
	private ButtonGroup vrGrupo = null;

	// Construtor da classe
	CCalculaConsumo() {
		setTitle("CalConsumo");
		setSize(400, 150);
		setLayout(new BorderLayout());
		setLocation(400, 350);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		alocaElementosInterface();
		posicionaElementosInterface();
		registraComponenteTratadorEventos();

		setVisible(true);
	}

	// Metodo responsavel pelo posicionamento dos objetos na tela
	void posicionaElementosInterface() {

		vrPainelNorte.add(vrLabelKm, BorderLayout.NORTH);
		vrPainelNorte.add(vrTextField, BorderLayout.WEST);
		vrPainelNorte.add(vrLabelRes, BorderLayout.CENTER);

		vrGrupo.add(vrRadioGas);
		vrGrupo.add(vrRadioAlc);
		vrGrupo.add(vrRadioDies);
		vrRadioGas.setSelected(false);
		vrPainelOeste.add(vrRadioGas, BorderLayout.NORTH);
		vrPainelOeste.add(vrRadioAlc, BorderLayout.WEST);
		vrPainelOeste.add(vrRadioDies, BorderLayout.SOUTH);

		vrPainelSul.add(vrBotao, BorderLayout.SOUTH);
		vrPainelSul.add(informacoes, BorderLayout.EAST);

		add(vrPainelNorte, BorderLayout.NORTH);
		add(vrPainelOeste, BorderLayout.WEST);
		add(vrPainelSul, BorderLayout.SOUTH);
	}

	// Metod responsavel pelo registro de componentes a interface
	private void registraComponenteTratadorEventos() {
		vrBotao.addActionListener(this);
		vrRadioGas.addActionListener(this);
		vrRadioAlc.addActionListener(this);
		vrRadioDies.addActionListener(this);
		vrTextField.addActionListener(this);
		informacoes.addActionListener(this);
	}

	// Metodo responsavel pelo tratamento de eventos
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == vrRadioGas) {
			aux = 3.20;
		}
		if (evento.getSource() == vrRadioAlc) {
			aux = 2.50;
		}
		if (evento.getSource() == vrRadioDies) {
			aux = 2.35;
		}

		if (evento.getSource() == vrBotao) {
			if(aux == 3.20){
				armazenaJtext = vrTextField.getText();
				Double converteEguardaJtext = Double.parseDouble(armazenaJtext);
				converteEguardaJtext = converteEguardaJtext / 10;
				aux = converteEguardaJtext * 3.20;
				vrTextField.setText("");
				vrLabelRes.setText("R$.: "+ aux);
			}
			if(aux == 2.50){
				armazenaJtext = vrTextField.getText();
				Double converteEguardaJtext = Double.parseDouble(armazenaJtext);
				converteEguardaJtext = converteEguardaJtext / 20;
				aux = converteEguardaJtext * 2.50;
				vrTextField.setText("");
				vrLabelRes.setText("R$.: "+ aux);
			}
			if(aux == 2.35){
				armazenaJtext = vrTextField.getText();
				Double converteEguardaJtext = Double.parseDouble(armazenaJtext);
				converteEguardaJtext = converteEguardaJtext / 5;
				aux = converteEguardaJtext * 2.35;
				vrTextField.setText("");
				vrLabelRes.setText("R$.: "+ aux);
			}
		}
		if(evento.getSource() == informacoes){
			new Informacoes();
		}
	}

	// Metodo responsavel pela instanciação dos objetos
	private void alocaElementosInterface() {
		vrPainelNorte = new JPanel();
		vrPainelSul = new JPanel();
		vrPainelOeste = new JPanel();

		vrBotao = new JButton("Calcular");

		vrLabelKm = new JLabel("Distancia em Km");
		vrLabelRes = new JLabel("R$.:");

		vrTextField = new JTextField();
		vrTextField.setColumns(8);

		vrRadioGas = new JRadioButton("Gasolina");
		vrRadioAlc = new JRadioButton("Alcool");
		vrRadioDies = new JRadioButton("Diesel");

		vrGrupo = new ButtonGroup();
		informacoes = new JButton("autor ;)");

	}
}

// Classe principal do programa
public class CDesafio {
	// Metodo principal do programa Java
	public static void main(String[] args) {
		new CCalculaConsumo();
	}
}
