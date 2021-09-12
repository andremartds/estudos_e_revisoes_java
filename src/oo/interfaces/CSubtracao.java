package oo.interfaces;

public class CSubtracao implements ICalculo, ICalculoCirculo{
	
	public double calcula(int x, int y) {
		return x-y;
	}
	public double circulo(double pLargura, double pAltura) {
		return pLargura * pAltura;
	}

}

