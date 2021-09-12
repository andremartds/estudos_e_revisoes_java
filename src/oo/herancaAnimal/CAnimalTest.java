package oo.herancaAnimal;

public class CAnimalTest {

	public static void main(String[] args) {
		Cgalinha coco = new Cgalinha();
		System.out.println(coco.getNome());
		coco.vDormir();
		coco.vFazerBarulho();
		
		CCoruja uhuh = new CCoruja();
		System.out.println(uhuh.getNome());
		uhuh.setCoresDaPena("Amarela e preta");
		System.out.println(uhuh.getCoresDaPena());
		uhuh.vDormir();
		uhuh.vFazerBarulho();
		System.out.println(uhuh.getPeso());
		
		//System.out.println(instanceof.);
		
		

	}

}
