package desafios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário 1:");
        double salario1 = scanner.nextDouble();

        System.out.print("Salário 2:");
        double salario2 = scanner.nextDouble();

        System.out.print("Salário 3:");
        double salario3 = scanner.nextDouble();


        double soma = salario1 + salario2 + salario3;
        System.out.print("O total dos ultimos três salários é: " + soma);

        double media = soma / 3;
        System.out.print("O média dos ultimos três salários é: " + media);

        // recado sistema que receeba salarios tanto com virgula, e tanto com ponto.











    }
}
