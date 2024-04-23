package fundamentos.operadores;

public class operadoresTernarios {
    public static void main(String[] args) {
        double media = 8.6;
        String resultadofinal = media >= 7.0 ? // expressao
                "Aprovado." : "de Recuperação."; // valor verdadeiro ou falso, ? e :

        System.out.println("O aluno está: " + resultadofinal);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && nota >= 7;
        String resultado = temDesconto ? "sim" : "não";

        System.out.println("Tem desconto? " + resultado);
// converter verdadeiro ou falso para: sim ou nao.

    }
}
