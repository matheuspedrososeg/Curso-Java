package exercicioconceitos;

import java.util.Scanner;

public class bhaskaraF {
    public static void main(String[] args) {

        // delta = b2 - 4.a.c
        // -b +_raiz delta dividido por 2.a

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o valor de A");
        double a = scanner.nextDouble();

        System.out.println("insira o valor de B");
        double b = scanner.nextDouble();

        System.out.println("insira o valor de C");
        double c = scanner.nextDouble();

        double delta1 = Math.pow(b , 2);
        double delta2 = 4 * a * c;
        double delta3 = delta1 - delta2;

        double eq = -b + Math.sqrt(delta3);
        double eqInf = 2 * a;
        double eq1res = eq / eqInf;

        double eq2 = -b - Math.sqrt(delta3);
        double eqInf2 = 2 * a;
        double eq2res = eq2 / eqInf2;

        System.out.println("x1 é igual a: " + eq1res);
        System.out.println("x2 é igual a: " + eq2res);

        scanner.close();

    }
}
