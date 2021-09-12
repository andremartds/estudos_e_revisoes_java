package oo.sobrescritaMetodos;

public class COperacaoMatematicaTeste {
	
	static void calculo(COperacaoMatematica o,int pX, int pY){
		System.out.println(o.calcularXY(pX,pY));
	}
	static void calculo(COperacaoMatematica parametro){
		System.out.println(parametro.calcularXY(1,6));
	}
	public static void main(String []args){
		
		calculo(new CSoma(),7,9);
		calculo(new CMultiplicacao(),7,9);
		calculo(new CSubtrai(),9,5);
		
		calculo(new CSoma());
		calculo(new CSubtrai());
	}

}
