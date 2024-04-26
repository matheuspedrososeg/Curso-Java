package exercicioconceitos;

import java.util.Scanner;

public class lerValorPow2e3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor: ");
        String valor = scanner.nextLine();

        double inpput = Double.parseDouble(valor);
        double quadrado = Math.pow(inpput, 2);
        System.out.println("o valor inserido elevado a 2 é igual a: " + quadrado);

        double cubo = Math.pow(inpput , 3);
        System.out.println("o valor inserido elevado a 3 é igual a: " + cubo);

        scanner.close();


    }
}
