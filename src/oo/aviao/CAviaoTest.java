package oo.aviao;

public class CAviaoTest {
	public static void main (String [] args){
		
		CAviao iQuantidadeV = null;
		iQuantidadeV = new CAviao();
		iQuantidadeV.iQuantidadeVagas = 100;
		if (iQuantidadeV.iQuantidadeVagas > 20){
			System.out.println("ok");
		}
		
		CAviao iDisponiveis = null;
		iDisponiveis = new CAviao();
		iDisponiveis.iTemDisponiveis = 19;
		
		CAviao iQuantas = null;
		iQuantas = new CAviao();
		iQuantas.iQuantas = 20;
		
		CAviao sAscentosDis = null;
		sAscentosDis = new CAviao();
		sAscentosDis.sQuaisAssentosDisponiveis = "20";
		
		System.out.println("Quantidade de vagas disponiveis "+iQuantidadeV.iQuantidadeVagas);
		System.out.println("itens disponiveis "+iDisponiveis.iTemDisponiveis);
		System.out.println("Quantas disponiveis "+sAscentosDis.sQuaisAssentosDisponiveis);
		System.out.println("Quais estão Disponiveis "+sAscentosDis.sQuaisAssentosDisponiveis);
		
		
		
		
	}

}
