package linguagem.switchexamples;

import java.util.Scanner;

public class SwitchTestBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a nota \n");
        int nota = entrada.nextInt();
        String conceito = "";

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7: case 6:
                conceito = "B";
                break;
            default:
                conceito = "não conhecido valor";
        }

        System.out.println("o conceito é " + conceito);
        entrada.close();
    }
}
