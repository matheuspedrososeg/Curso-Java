package desafiosControle;

import java.util.Locale;
import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);


        // calcular media das notas turma
        // digitar nota valida 0-10 ---- feito
        // armazenar nota valida como variavel "total"
        // total armazena soma de todas as notas, e total de notas digitadas
        // mostrar resultado, quando usuario digitar -1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a média: ");
        double media = scanner.nextDouble();

        if(media > 10 || media < 0) {
            System.out.println("nota inválida. \n  insira uma nota válida: ");
        } else {
            System.out.println("Média inserida com sucesso.");
        }


        String total = scanner.nextLine();

        while(!total.equalsIgnoreCase("-1")) {
            System.out.println("o que fara agora?");
            total = scanner.nextLine();
        }



        scanner.close();
    }
}
