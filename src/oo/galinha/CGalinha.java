package oo.galinha;

public class CGalinha {
	
	public static int todosOvos;
	public int iOvos;
	
	public CGalinha botaOvo(){
		this.iOvos++;//total de ovos de cada galinha
		CGalinha.todosOvos++;//total de ovos de toda a granja
		return this;
	}
	public static double iMediaOvos(double iMedia){
		return CGalinha.todosOvos / iMedia;
	}
}
