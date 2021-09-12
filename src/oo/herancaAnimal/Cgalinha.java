package oo.herancaAnimal;

public class Cgalinha extends CAnimal {
	
	Cgalinha(){
		super("Coco ", 2);
	}
	
	@Override
	void vDormir() {
		System.out.println("Dormindo mais leve...");
	}

}
