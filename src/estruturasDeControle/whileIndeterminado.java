package estruturasDeControle;

import java.util.Scanner;

public class whileIndeterminado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String valor = " ";

        while(!valor.equalsIgnoreCase("sair")) { // enquanto nao for escrito "sair", o codigo nao ira terminar
            System.out.print("Você diz: ");
            valor = scanner.nextLine();

        }






        scanner.close();
    }
}
