package logica_exercicios;

import javax.swing.JOptionPane;//biblioteca necessaria para trazer as caixas  de dialogo
// 	REVISADA 09/09/2020
class CAutomovel {
    public static void main(String args[]) {
        float fCustoFabrica, fPercentualRevenda, fImposto, fPrecoFinal;
        fCustoFabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o  custo de fabrica"));
        fPercentualRevenda = (25 * fCustoFabrica) / 100;
        fImposto = (40 * fCustoFabrica) / 100;
        fPrecoFinal = fCustoFabrica + fPercentualRevenda + fImposto;

        JOptionPane.showMessageDialog(null,
                " \n o valor de fabrica é ........." + fCustoFabrica + " \n O percental do revendedor é..."
                        + fPercentualRevenda + " \n O imposto é .................." + fImposto
                        + " \n O preço final é .............." + fPrecoFinal);

    }
}