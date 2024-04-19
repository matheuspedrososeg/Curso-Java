package fundamentos;

public class inferencia {

    public static void main(String[] args) {
        double a = 4.5; // declarar e inicializar
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        c = "outro texto";
        System.out.println(c);

        double d;// declarada
        d = 123.5; // inicializada
        System.out.println(d); // usada

        var e = 123.45; // var deve ser declarada e inicializada na mesma linha
        System.out.println(e);

        var f = 12; // inteiro
        // f = 12.01;
        System.out.println(f);
    // decimais podem ser declaradas posteriormente como inteiros, mas não vice versa
        }
}
