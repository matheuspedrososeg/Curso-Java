package desafios;

import java.util.Scanner;

public class testerestodedivisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para descobrir se ele é par ou impar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par!");
        } else {
            System.out.println(numero + " é impar!");
        }
    }
}
