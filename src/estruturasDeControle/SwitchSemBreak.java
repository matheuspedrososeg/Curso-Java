package estruturasDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // if(bool) ...
        // while (bool) ...
        // for (;bool) ....

        String faixa = "vermelha";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("sei o bassai-dai...");
            case "marrom":
                System.out.println("sei o tekki shodan");
            case "roxa":
                System.out.println("sei o heian godan");
            case "verde":
                System.out.println("sei o heian yodan");
            case "laranja":
                System.out.println("sei o heian sandan ");
            case "vermelha":
                System.out.println("sei o heian nidan");
            case "amarela":
                System.out.println("sei o heian shodan");
                break;

                // default:
               //  System.out.println("nao sei nada");
        }

        System.out.println("Fim");

        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("sabe programar");
            case 2:
                System.out.println("sabe falar");
            case 1:
                System.out.println("sabe andar");
            case 0:
                System.out.println("sabe respirar");
        }



    }

}
