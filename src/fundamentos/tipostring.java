package fundamentos;

import java.sql.SQLOutput;

public class tipostring {

    public static void main(String[] args) {
        System.out.println("ola pessoal".charAt(2));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + ("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.endsWith("Tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // startswith reconhece letras maiusculas ou minsuculas

        // neste caso, se colocado .tolowercase reconheceria em letra minusculas

// equalsignorecase ignora maiusculo ou minusculo

        var nome = "pedro";
        var sobrenome = "santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome);
        System.out.printf("o sehor %s %s tem %d e ganha %.2f \n"
                , nome , sobrenome, idade , salario);

        String frase = String.format("o sehor %s %s tem %s e ganha %s" , nome, sobrenome, idade, salario);

        System.out.println(frase);


    }
}
