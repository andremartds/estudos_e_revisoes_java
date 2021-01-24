package logica_exercicios.media;

import javax.swing.JOptionPane;

public class Faculdade {
	private String nome;
	private double notaA1;
	private double notaA2;
	private double media;
	private long quantidadeAlunos;

	public Faculdade(String nome, double notaA1, double notaA2, double media,
			long quantidadeAlunos) {
		this.nome = nome;
		this.notaA1 = notaA1;
		this.notaA2 = notaA2;
		this.media = media;
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	public void media() {
		this.media = (notaA1 + notaA2) / 2;
		if(this.media < 6) {
			JOptionPane.showConfirmDialog(null,"Aluno: " + this.nome +  " você de recuperação");
		} else if (this.media > 7 && this.media < 10) {
			JOptionPane.showConfirmDialog(null,"Aluno: " + this.nome +  "você está de aprovado com médida: " + this.media);
		} else {
			JOptionPane.showConfirmDialog(null,"outras condições adicione um else if");
		}
	}
	
	public Faculdade() {}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNotaA1(double notaA1) {
		this.notaA1 = notaA1;
	}

	public double getNotaA1() {
		return notaA1;
	}

	public void setNotaA2(double notaA2) {
		this.notaA2 = notaA2;
	}

	public double getNotaA2() {
		return notaA2;
	}

	public double getMedia() {
		media = (getNotaA1() + getNotaA2() / getQuantidadeAlunos());
		return media;
	}

	public void setQuantidadeAlunos(long quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public long getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
}