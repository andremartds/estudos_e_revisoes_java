package oo.contrustor;

import java.util.ArrayList;

public class Construtor {
	Construtor(){}
	ArrayList<Alunos>alunos = new ArrayList<Alunos>();
	
	void addAluno(Alunos pAluno){
		alunos.add(pAluno);
	}
	void percorreArray(){
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).nome);
		}
	}
	public String toString(){
		return alunos.toString();
	}

}
