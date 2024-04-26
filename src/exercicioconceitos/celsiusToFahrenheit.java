package exercicioconceitos;

import javax.swing.*;

public class celsiusToFahrenheit {
    public static void main(String[] args) {

        // celsius / 5 = f -32 / 9
        // divide por 5, multiplica por 9, soma 32

       double celsius = Double.parseDouble(JOptionPane.showInputDialog("insira a temperatura em celsius"));

       double divide = celsius / 5;
       double mult = divide * 9;
       double soma = mult + 32;

        System.out.println("a temperatura em fahrenheit é: " + soma);



    }
}
