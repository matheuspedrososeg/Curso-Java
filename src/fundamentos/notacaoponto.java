package fundamentos;

public class notacaoponto  {
    public static void main(String[] args) {

        String s = "Bom Dia X";
        s =  s.replace("X" , "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

    String y = "Bom dia X".replace("X" , "Gui").toUpperCase() .concat("!!!");
        System.out.println(y);
        // tipos primitivos nao tem o operador "."

        int a = 3;
        System.out.println(a);
    }
}
