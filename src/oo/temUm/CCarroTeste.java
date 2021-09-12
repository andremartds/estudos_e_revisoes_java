package oo.temUm;

public class CCarroTeste {

	public static void main(String[] args) {
		CCarro fusca = new CCarro("Wolks wagem",140,100);
		System.out.println("Marca "+fusca.sMarca);
		System.out.println("Velocidade Total "+fusca.iVelocidade);
		System.out.println("Ating de Zero a Cem em "+fusca.iVelocidadeZeroCem+" Segundos ");
		CCarroTemUmMotor ap = new CCarroTemUmMotor();
		ap.sTipoMotor = "ap 16 Valvulas";
		ap.iPotencia = 800;
		fusca.setMotor(ap);// no caso eu adiciono o motor ap a fusca com o tem um
		System.out.println("agora o fusca tem a potencia "+fusca.getMotor().iPotencia+" KV");
		System.out.println("agora o fusca tem um motor "+fusca.getMotor().sTipoMotor);
		
		CCarro focus = new CCarro("Wolks wagem",140,100,new CCarroTemUmMotor("Motor de Calhabeque ",34));
		
		System.out.println("O carro Focus tem a Marca "+focus.sMarca+"/n"
							+"o Motor do focus � um "+focus.getMotor().sTipoMotor);
		
	}

}
