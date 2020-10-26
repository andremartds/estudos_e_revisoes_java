package logica_exercicios;

import javax.swing.JOptionPane;

// 	REVISADA 09/09/2020
public class VerificaNumeroMaiorQue {

    public static float leitura() {
        float v = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor"));
        return v;
    }

    public static boolean verificar(float a) {
        if (a >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        float leitura = VerificaNumeroMaiorQue.leitura();

        boolean valor = VerificaNumeroMaiorQue.verificar(leitura);

        if (valor == true) {
            JOptionPane.showMessageDialog(null, leitura + " SUCESSO é maior");
        } else {
            JOptionPane.showMessageDialog(null, leitura + " é Menor");
        }

    }
}
