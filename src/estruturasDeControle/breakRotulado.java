package estruturasDeControle;

public class breakRotulado {
    public static void main(String[] args) {

        // exemplo que nao deve ser usado, deve fugir dessa bomba

        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {


                if (i == 1) {
                    break externo;
                }
                System.out.printf("[%d %d]", i , j);
            }
            System.out.println();
        }
        System.out.println("fim");
    }
}
