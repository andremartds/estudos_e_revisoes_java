package oo.funcionario_herdado;

public class AcumloBonificacao {
	
	private double totalBonificao;
	private static int totalXBonificacao;
	
	public double bonificacaoTotal(Funcionario f) {
		AcumloBonificacao.totalXBonificacao++;
		return f.getBonificacao() + 100.0;
	}
	
	public double getTotalBonificao() {
		return totalBonificao;
	}
	
	public void setTotalBonificao(double totalBonificao) {
		this.totalBonificao = totalBonificao;
	}
	
	public static int getTotalXBonificacao() {
		return AcumloBonificacao.totalXBonificacao;
	}
	
	
}
