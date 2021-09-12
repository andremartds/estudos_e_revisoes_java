package logica_exercicios;

public class PercorreString {
    public static void main(String[] args) {
        String [] alfabeto = new String[3];

        alfabeto[0] = "a";
        alfabeto[1] = "b";
        alfabeto[2] = "c";

        for(int i = 0; i < alfabeto.length; i++) {
           System.out.println(alfabeto[i].toUpperCase());
        }
        System.out.println();
    }
}
