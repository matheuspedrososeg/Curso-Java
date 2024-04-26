package exercicioconceitos;

import java.util.Scanner;

public class fahrenheittocelsius {
    public static void main(String[] args) {

        Scanner conversion = new Scanner(System.in);

        System.out.println("insira a temperatura em fahrenheit: ");
        double fahrenheit = Double.parseDouble(conversion.nextLine());

        double subtrair = fahrenheit - 32;
        double multiplicar = subtrair * 5;
        double resultado = multiplicar / 9;


        System.out.println(fahrenheit + "fahrenheit em celsius é igual a:" + resultado);

        conversion.close();
    }
}
