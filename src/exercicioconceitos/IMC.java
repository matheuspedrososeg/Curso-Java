package exercicioconceitos;

import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        // ler peso. ler altura, imprimir imc;

        Scanner imc = new Scanner(System.in);

        System.out.println("insira seu peso: ");
        double peso = imc.nextDouble();;

        System.out.println("insira sua altura: ");
        double alt = imc.nextDouble();

        double pot = Math.pow(alt , 2);


        double divisao = peso / pot;

        System.out.println("o seu imc é: " + divisao);


    }
}
