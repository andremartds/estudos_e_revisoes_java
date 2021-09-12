package linguagem.scanner;

import java.util.Scanner;

public class EntradaScannerSaidaConsole {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("Por favor aplique seu nome: ");
		String inputName = inputData.nextLine();
		
		System.out.print("Por favor aplique sua idade: ");
		String InputAge = inputData.nextLine();		
		
		System.out.print("Seus dados são: " + inputName + " "+ InputAge);
		
		inputData.close();
	}
}
