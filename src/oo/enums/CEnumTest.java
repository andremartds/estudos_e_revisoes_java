package oo.enums;

public class CEnumTest {

	public static void main(String[] args) {
		System.out.println(EnumXaderz.BISPO);
		System.out.println(EnumXaderz.CAVALO);
		System.out.println(EnumXaderz.PEAO);
		System.out.println(EnumXaderz.RAINHA);
		
		System.out.println(CEnumPeso.GR.nome);
		System.out.println(CEnumPeso.KL);
		System.out.println(CEnumPeso.TKL);
		
		for (CEnumPeso i : CEnumPeso.values()) {
			System.out.println(i + " - " + i.nome);
		}
		

	}

}
