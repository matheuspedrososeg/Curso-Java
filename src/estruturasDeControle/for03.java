package estruturasDeControle;

public class for03 {
    public static void main(String[] args) {

        int i = 0; // caso coloque fora de int, sera possivel acessar o i apartir de qualquer lugar do codigo


        for (; i < 10; i++) { // caso coloque int dentro de for, nao sera possivel acessar fora do bloco de texto do for
            System.out.println(i);
        }
        // porem se colocado dentro do for, e ser reescrevido aqui, a varivael podera ser definida denovo

        System.out.println("Saiu do for...");
        System.out.println(i);
    }
}