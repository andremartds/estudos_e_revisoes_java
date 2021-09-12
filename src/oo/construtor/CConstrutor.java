package oo.construtor;

public class CConstrutor {
	int velocidade;
	String modelo;
	String cor;
	
	CConstrutor(){
		//se for trabalhar direto no construtor não preciso inicialo
	}
	CConstrutor(int pVelocidade, String pModelo, String pCor){
		velocidade = pVelocidade;
		modelo = pModelo;
		cor = pCor;
	}
}
