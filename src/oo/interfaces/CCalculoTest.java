package oo.interfaces;

public class CCalculoTest {
	public static void somaCPolimorfismo(ICalculo j,int x,int y){
		System.out.println(j.calcula(x,y));
	}
	public static void main(String[] args){
		CSoma s = new CSoma();
		System.out.println(s.calcula(3, 4));
		
		CSubtracao sub = new CSubtracao();
		System.out.println(sub.calcula(5,3));
		
		somaCPolimorfismo(new CSoma(),1,1);
		somaCPolimorfismo(new CSubtracao(),5,1);
		
		
	}

}
