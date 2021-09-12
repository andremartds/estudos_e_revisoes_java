package oo.matematica;

class CMatematica {
	public int logica;
	
	int iSoma(int um, int dois) {
		return um + dois;
	}
	CMatematica() {
		// TODO Auto-generated constructor stub
	}
	CMatematica(int pNumero){
		logica = pNumero;
	}
	int iSomaDiferente(int ... iNumeros) {// isso é um array
		int total =0;
		for (int i = 0; i < iNumeros.length; i++) {//for(double n : iNumeros)
			total = total + iNumeros[i];
		}return total;
	}

	double dCompara(double um, double dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	double media(double um , double dois){
		System.out.print("media(double um , double dois) ");
		return (um+dois) /2;
	}
	double media(String um , String dois){
		System.out.print("media(String um , String dois) ");
		int iUm = Integer.parseInt(um);
		int iDois = Integer.parseInt(dois);
		return (iUm + iDois) / 2;
	}
	int media(int ... iN){
		System.out.print("media(int ... iN) ");
		return this.iSomaDiferente(iN)/iN.length;
	}

	int iRaiz(int iNumero) {
		int iResul = 0;
		int iGravaNumero = 1;
		while(iGravaNumero <= iNumero){
			iNumero = iNumero - iGravaNumero;
			iGravaNumero = iGravaNumero + 2;
			iResul =  iResul + 1;		
		}return iNumero = iResul;
	}
	
}

/**
 * achando a raiz quadrada de um numero por exemplo a raiz quadrada de 16 que �
 * quatro para chegarmos a esse valor fazemos como o metodo de PELL faz se o
 * seguinte 16 - 1 = 15 15 - 3 = 12 12 - 5 = 8 8 - 7 = 1 nesse caso foram 4
 * s�culos ent�o constatamos que a raiz de 16 � 4
 */
