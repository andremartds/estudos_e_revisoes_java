package oo.tiposGenericos;

import java.util.ArrayList;

public class Genericos <E>{
	
	private E generico;


	public E getGenerico() {
		return generico;
	}


	public void setGenerico(E generico) {
		this.generico = generico;
	}
	
	
	
	
	public double soma(ArrayList<? extends Number> list){
		double total = 0;
		for (Number numeros : list) {
			total = total + numeros.doubleValue();
		}
		return total;
	}
	

	public static void main(String[] args) {
		Genericos<Number> numero = new Genericos<>();
		ArrayList<Number> n = new ArrayList<>();
		n.add(23);
		n.add(24);
		System.out.println(numero.soma(n));
		

	}



}
