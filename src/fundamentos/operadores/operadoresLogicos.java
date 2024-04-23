package fundamentos.operadores;

public class operadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // && condicao1 E condicao2
        System.out.println(condicao1 || condicao2); // || condicao1 OU condicao2
        System.out.println(condicao1 ^ condicao2); // exclusivamente OU , um é verdadeiro e o outro é falso.
        System.out.println(!condicao1); // ! inverte, de verdadeiro para falso, e vice versa
        System.out.println(!condicao2); // ! inverte, de verdadeiro para falso, e vice versa

        System.out.println("tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
       // System.out.println(false && true);
        // System.out.println(false && false);

        System.out.println("tabela verdade OU (OR)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("tabela verdade OU EXCLUSIVO (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);


        System.out.println("tabela verdade (NOT)");
        System.out.println(!true);
        System.out.println(!false);

    }
}
