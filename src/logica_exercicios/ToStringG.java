package logica_exercicios;

import java.util.ArrayList;

public class ToStringG {
	
	ArrayList<Integer> vet = new ArrayList<Integer>();
	
	public void insere(Integer valor){
		vet.add(valor); 
	}
	
	public void imprimeFor(){
		int i = 0;
		for (;i < vet.size(); i++) {
			System.out.println(vet.get(i));
		}
	}
	public static void main(String[] args) {
		ToStringG m = new ToStringG();
		m.insere(123);
		m.insere(124);
		m.insere(125);
		m.insere(126);
		m.imprimeFor();
	}
}
