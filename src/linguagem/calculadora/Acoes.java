package linguagem.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Acoes implements ActionListener{
	Double valor;
	Double resultado;
	String operacao, con;
	boolean clik = false, segundoNumero = false;
	// crio um objeto calculadora para essa classe conseguir enchegar onde est??????o
	// criados os componentes
	CalculaFacto calc = null;

	// no construtor eu crio no parametro dele um objeto do tipo da
	// implementacao do Jframe e digo que o objeto calc
	// vai receber tudo da outra classe ou seja esse objeto vai conseguir
	// enchegar a classe CalculaFacto
	public Acoes(CalculaFacto copia) {
		// aqui eu confirmo que tudo que for iniciado pelo construtor vai poder
		// ser atribuido pelo objeto calc
		// assim eu posso fazer calc.alguma metodo ou atributo que tenha na
		// outra classe
		calc = copia;
		// nesse construtor alem de eu receber a c??????pia eu crio um ouvinte para
		// cada bot??????o
		for (int i = 0; i < calc.vetButon.length; i++) {
			// esse ouvinte aponta para essa classe pois ela que tem a
			// implementa????????????o de ActionListener ou seja (this)
			calc.vetButon[i].addActionListener(this);
		}

	}

	// metodo para fazer a implementacao dos cliques do mouse
	@Override
	public void actionPerformed(ActionEvent evento) {
		for (int i = 0; i < calc.vetButon.length; i++) {
			//para pegar os bot?????????es e adcionalos ao JtextField
			if (evento.getSource() == calc.vetButon[i]) {				
				if(calc.vetButon[i].getText().equals(".")) {
					calc.caracteres.setText(calc.caracteres.getText()+".");						
					clik = false;
				}
				if(calc.vetButon[i].getText().equals("0"))
					concatena("0");
				if(calc.vetButon[i].getText().equals("1"))
					concatena("1");
				if(calc.vetButon[i].getText().equals("2"))
					concatena("2");
				if(calc.vetButon[i].getText().equals("3"))
					concatena("3");
				if(calc.vetButon[i].getText().equals("4"))
					concatena("4");
				if(calc.vetButon[i].getText().equals("5"))
					concatena("5");
				if(calc.vetButon[i].getText().equals("6")) 
					concatena("6");
				if(calc.vetButon[i].getText().equals("7"))
					concatena("7");
				if(calc.vetButon[i].getText().equals("8"))
					concatena("8");
				if(calc.vetButon[i].getText().equals("9"))
					concatena("9");

				if (((JButton)evento.getSource()).getText().equals("+")) {
					if(segundoNumero == true)
						result();
					atribuir("adicao");
					segundoNumero = true;
				}
				if (((JButton)evento.getSource()).getText().equals("-")) {

					if(segundoNumero == true)
						result();
					atribuir("subtracao");
					segundoNumero = true;
				}
				if (((JButton)evento.getSource()).getText().equals("*")){
					if(segundoNumero == true)
						result();
					atribuir("multiplicacao");
					segundoNumero = true;
				}
				if (((JButton)evento.getSource()).getText().equals("/")) {
					if(segundoNumero == true)
						result();
					atribuir("divisao");
					segundoNumero = true;
				}				
				if(((JButton)evento.getSource()).getText().equals("=")){
					result();
			}				
				//calc.caracteres.setText(calc.caracteres.getText() + ((JButton) evento.getSource()).getText());
		}
	}
}		
		//metodo para atribuir o valor digitado e falar qual a operacao
		public void atribuir(String pOperacao){
			clik = true;
			valor = Double.parseDouble(calc.caracteres.getText());
			operacao = pOperacao;
		}
		
		//metodo para concatenar os numeros que s?????????o clicados
		public void concatena(String cont){
			if(clik == true){
				calc.caracteres.setText(cont);
			} else{
				calc.caracteres.setText(calc.caracteres.getText()+cont);						
			}
			clik = false;
		}
		
		//traz o resultado final da operacao
		public void result(){
			if(operacao.equals("adicao") ){
				resultado = valor + Double.parseDouble(calc.caracteres.getText());
				calc.caracteres.setText(String.valueOf( resultado ));
			}
			if(operacao.equals("subtracao")){						
				resultado = valor - Double.parseDouble(calc.caracteres.getText());
				calc.caracteres.setText(String.valueOf( resultado ));					
			}
			if(operacao.equals("multiplicacao")){						
				resultado = valor * Double.parseDouble(calc.caracteres.getText());
				calc.caracteres.setText(String.valueOf( resultado ));					
			}	
			if(operacao.equals("divisao")){						
				resultado = valor / Double.parseDouble(calc.caracteres.getText());
				calc.caracteres.setText(String.valueOf( resultado ));					
			}
			//diz que o clik ?????? true para pegar apenas um elemento da pr?????????xima vez
			clik = true;
			//diz que o segundoNumero ?????? false para quando ele for true nas operacoes eu chamar o resultado
			segundoNumero = false;
		}
}