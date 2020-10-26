package logica_exercicios;

import javax.swing.JOptionPane;
class CNumerosEntreNumeros {
 public static void main(String args[]) {
   int iNumeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial"));
   int iNumeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final"));
   int iIndice = iNumeroInicial;
   int iNumeroPar = 0;
   int iNumeroImpar = 0;
   while(iIndice < iNumeroFinal){
	   if (iIndice % 2 == 0){
		   iNumeroPar ++;
		   iIndice++;
	   }else {
          iNumeroImpar ++;
	   	  iIndice++;
   		}
   		}
   JOptionPane.showMessageDialog(null,"O  entre o  numero inicial = " + iNumeroInicial+"\n"+
           "e o numero final " + iNumeroFinal +"\n"+
            "exitem  "+iNumeroPar +" numeros pares e "+"\n"+
            "existem" + iNumeroImpar + " impares "
            );

}
}