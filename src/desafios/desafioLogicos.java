package desafios;

import java.util.Scanner;

public class desafioLogicos {
    public static void main(String[] args) {
        // trabalho na terca (V OU F)
        // trabalho na quinta (V OU F)
        // se ambos trabalhos foram aceitas, comprar tv 55 pol
        // se um deles der certo, comprar tv 32 pol
        // comprando qualquer uma das tvs, ir tomar sorvete no shopping
        // caso nenhum trabalho aconteca, familia em casa, sem tomar sorvete



        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comproutv50 = trabalho1 && trabalho2;
        boolean comproutv32 = trabalho1 ^ trabalho2;
        boolean comprousorvete = trabalho1 || trabalho2;
        System.out.println("Comprou tv 50\" ? " + comproutv50);
        System.out.println("Comprou tv 32\" ? " + comproutv32);
        System.out.println("Comprou sorvete\" ? " + comprousorvete);

        // operador unário
        System.out.println("Mais sáudavel?" + !comprousorvete);


    }
}
