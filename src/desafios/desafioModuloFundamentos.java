package desafios;

import java.util.Scanner;

public class desafioModuloFundamentos {
    public static void main(String[] args) {
        // ler num1
        // ler num2
        // + - * / %

        Scanner desafio = new Scanner(System.in);

        System.out.println("valor 1");
      double num1 = desafio.nextDouble();
        System.out.println("valor 2");
      double num2 = desafio.nextDouble();

        System.out.println("operacao");
      String operacao = desafio.next();

      double resultado = "+" .equals(operacao) ?  num1 + num2 : 0;
      resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f" , num1, operacao, num2, resultado);
        System.out.println();

        desafio.close();
    }
}
