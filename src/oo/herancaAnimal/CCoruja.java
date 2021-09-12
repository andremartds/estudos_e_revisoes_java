package oo.herancaAnimal;

public class CCoruja extends CAnimal {
	private String coresDaPena;
	
	CCoruja (){
		super("Zoiuda",5);
	}

	public String getCoresDaPena() {
		return coresDaPena;
	}

	public void setCoresDaPena(String coresDaPena) {
		this.coresDaPena = coresDaPena;
	}
	
	
}
