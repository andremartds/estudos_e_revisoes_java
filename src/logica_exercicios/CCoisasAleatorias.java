package logica_exercicios;

class CCoisasAleatorias {
	public static void main (String [] args) {
	String [] Vet1 = {" carro "," moto ", " cidade ", " espelho ", "pe�o ", "adesivo","camadas"};// fiz o vetor string 1
	
	String [] Vet2 = {"Garrafa","xicara","tJ","A�UCAR","1234","bin�rio","octal","hexadecimal"};//2
	
	String [] Vet3 = {"3444","cds","arroz","pepino","Tomate","beterraba","gil�","qualquer coisa"};//3
	
	int iPrimeiroVetor = Vet1.length; //verifico quantos elemetos tem dentro do elemento 1 e atribuo a uma nova variavel esse valor
	int iSegundoVetor = Vet2.length; //verifico quantos elemetos tem dentro do elemento 2 e atribuo a uma nova variavel esse valor
	int iTerceiroVetor = Vet3.length; //verifico quantos elemetos tem dentro do elemento 3 e atribuo a uma nova variavel esse valor
	
	int iAleatorio1 = (int) (Math.random() * iPrimeiroVetor); // gero numero aleatorios e atribuo o valor a aleatorio1
	int iAleatorio2 = (int) (Math.random() * iSegundoVetor);//2
	int iAleatorio3 = (int) (Math.random() * iTerceiroVetor);//3
	String sArmazenaTudo = Vet1[iAleatorio1] + " " + Vet2[iAleatorio2] + " " + Vet3[iAleatorio3];// concateno
	System.out.println("Precisamos de "+sArmazenaTudo);	// imprimo 
	}

}