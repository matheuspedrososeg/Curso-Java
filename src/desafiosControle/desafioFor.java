package desafiosControle;

public class desafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println("valor");
            valor += "#";

            // versao do desafio
            // noa pode valor numerico

            for(String v = "#"; !v.equals("######"); v += "#") {
                System.out.println(v);
            }
        }
    }
}
