package oo.aviao_01;

public class Voo {
	int numeroVoo;
	String destino;
	String sOrigem;
	
	Voo(int numero,String destino, String sOrigem){
		this.numeroVoo = numero;
		this.destino = destino;
		this.sOrigem = sOrigem;
	}
	
	boolean voochegada(){
		if(sOrigem != null){
			return true;
		}
			return false;
	}
		
		boolean vooSaida(){
			if(destino != null){
				return true;
			}
			return false;
		}
		public String toString(){
			if(voochegada()){
				return "Voo "+numeroVoo + " de origem "+sOrigem;
			}
				return "Voo "+numeroVoo + " de origem "+destino;
		}
}
