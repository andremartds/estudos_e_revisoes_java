package logica_exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteArraList {
	public static void inserePessoas(){
		int sair; 
		ArrayList<String> pessoas = new ArrayList<String>();
		for(int i = 0; i < pessoas.size(); i++){
			pessoas.add(JOptionPane.showInputDialog(null,"Por favor insira seu nome"));
			sair = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja digite 1 se quizer sair digite 2"));
			if(sair  == 1){
				for(int j = 0; j< pessoas.size(); j++){
					System.out.println(pessoas.get(j));
				}
					
			} else
				System.out.println("erro");
				
		}
	}	


	public static void main(String[] args) {
		TesteArraList.inserePessoas();

	}

}
