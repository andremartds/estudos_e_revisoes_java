package oo.funcionario_herdado;

public class TesteImpostoCalculado {
	public static void main(String[] args) {
		
		SeguroDeVida sdv = new SeguroDeVida();
		sdv.setValor(100);
		SeguroCarro sc = new SeguroCarro();
		sc.setValor(100);
		
		CalculadorImposto calculaImposto = new CalculadorImposto();
		calculaImposto.imposto(sdv); // polimorfismo lindo
		calculaImposto.imposto(sc); // polimorfismo lindo
		
		System.out.println(sdv.getValor());
		System.out.println(sc.getValor());
		
	}
}
