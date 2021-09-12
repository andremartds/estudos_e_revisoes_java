package linguagem.conversaotipoprimitivos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1; // comversão implicita
		System.out.println(a);
		
		float b = (float) 1.0; // fizemos uma conversão explicita utilizando o cast
		System.out.println(b);
		
		// o java só verifica o tipo e não o tamanho, a prova está abaixo
//		int c = 1;
//		byte ee = (byte) c;
//		System.out.println(ee);
		
		// como um int é menor que o double ele simplemente ignora todo o resto quando fazemos o cast
		double f = 1.299999;
		int g = (int) f;
		
		
	}
}
