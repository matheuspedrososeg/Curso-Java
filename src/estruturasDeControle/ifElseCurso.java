package estruturasDeControle;

import javax.swing.*;


public class ifElseCurso {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero: ");

        int numero = Integer.parseInt(valor);

        if(numero %2 == 0) {
            System.out.println("numero par!");
        }
        if(numero %2 == 1) {
            System.out.println("numero impar");
        }

        if(numero%2 == 0) {
            System.out.println("numero par");
          }  else {
            System.out.println("numero impar");
        }







    }
}
