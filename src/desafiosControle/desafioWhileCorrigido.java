package desafiosControle;

import java.util.Scanner;

public class desafioWhileCorrigido {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = scanner.nextDouble();


            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if( nota != -1) {
                System.out.println("Insira uma nota válida: ");

            }
        }

        // calcular a media

        double media = total / quantidadeDeNotas;
        System.out.println("A média é " + media);


        scanner.close();
    }
}
