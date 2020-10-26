package logica_exercicios;

class CtabuadaComWhile {
	public static void main(String args[]) {
		int iTab = 1, iTab1 = 1;
		while (iTab <= 10) {
			while (iTab1 <= 10) {
				int iScape = iTab * iTab1;
				System.out.println("" + iTab + " x " + iTab1 + " = " + iScape);
				iTab1++;
			}
			iTab1 = 1;//reset
			iTab++;
		}

	}
}