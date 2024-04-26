package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class testee {
    public static void main(String[] args) {

String numero1 = JOptionPane.showInputDialog("Numero 1");
String numero2 = JOptionPane.showInputDialog("numero 2");

double valor1 = Double.parseDouble(numero1);
double valor2 = Double.parseDouble(numero2);

double operacao = valor1 + valor2;

        System.out.println(operacao);




    }
}
