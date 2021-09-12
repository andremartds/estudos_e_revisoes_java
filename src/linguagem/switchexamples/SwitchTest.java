package linguagem.switchexamples;

/*
* Exemplo de switch - java
* */

public class SwitchTest {
    public static void main(String[] args) {
        int idade = 3;

        switch (idade) {
            case 3: System.out.println("A idade é boa para brincar");break;
            case 2: System.out.println("A idade é boa para nanar"); break;
            case 1: System.out.println("A idade é boa para admirar"); break;
        }
    }
}