package oo.interfaces;

public class CSoma implements ICalculo{
	
	public double calcula(int x, int y) {
		return x+y;
	}
	public double circulo(double pLargura, double pAltura) {
		return pLargura * pAltura;
	}

}
