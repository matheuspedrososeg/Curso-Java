package exercicioconceitos;

import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        // b * h / 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.println("insira a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double mult = base * altura;
        double div = mult / 2;

        System.out.println("a área do triângulo é:" + div);

        scanner.close();
    }
}
