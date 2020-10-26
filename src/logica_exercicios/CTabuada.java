package logica_exercicios;

class CTabuada {
	public static void main(String args[]) {
		int iEscap = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				iEscap = i * j;
				System.out.println("" + i + " x " + j + " = " + iEscap + "\n");
			}
		}

	}
}