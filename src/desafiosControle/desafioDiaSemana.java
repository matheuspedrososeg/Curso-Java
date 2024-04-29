package desafiosControle;

import java.util.Scanner;

public class desafioDiaSemana {
    public static void main(String[] args) {
        // domingo -> 1
        // quarta -> 4
        // terça -> 3
        // etc...

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dia da semana: ");
        String diadasemana = scanner.nextLine();

        if ("segunda".equalsIgnoreCase(diadasemana)) {
            System.out.println("2");
        } else if (diadasemana.equalsIgnoreCase("terça")) {
            System.out.println("3");
        } else if (diadasemana.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (diadasemana.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if (diadasemana.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (diadasemana.equalsIgnoreCase("sábado")) {
            System.out.println("7");
        } else if (diadasemana.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else {
            System.out.println("dia inválido");
        }

        scanner.close();
    }
}
