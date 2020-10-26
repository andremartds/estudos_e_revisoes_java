package logica_exercicios;

/*
 * Escreva um programa para calcular quantos quilômetros o dono de um veículo que
 * esteja com o tanque cheio consegue dirigir até que o tanque se esvazie, levando
 * em consideração que: O carro tem o consumo médio de 9.5 Km/L O tanque tem capacidad
 * e para 45 Litros de combustível
 *
 * */
public class KmRodado {
	public static void main(String[] args) {
		double tanque = 45;
		double media = 9.5;
		media = tanque * media;
		System.out.println("A media é = "+media);
	}

}
