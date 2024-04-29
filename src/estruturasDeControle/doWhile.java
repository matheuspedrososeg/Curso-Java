package estruturasDeControle;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        // if(...) sentenca; ou {}
        // while(..) sentenca; ou {]
        // for (...; ...; ...) sentenca; ou {}

        // do {} while(...);
        // do while termina com ;
        // do while acontecera pelo menos uma vez

        Scanner scanner = new Scanner(System.in);

        String texto = " ";
        do {
            System.out.println("Você precisa falar \nas palavras mágicas...");
            System.out.println("Quer sair?");

            texto = scanner.nextLine();

        } while (!texto.equalsIgnoreCase("por favor")); // enquanto nao for escrito por favor, nao ira acabar a repeticao.


        System.out.println("obrigado!");


        scanner.close();
    }
}
