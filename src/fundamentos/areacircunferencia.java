package fundamentos;

public class areacircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14159; // final = mantem numero da variavel
double area = pi * raio * raio;

        System.out.println(area);
raio = 10;
area = pi * raio * raio;
        System.out.println("area = " + area + "m2");
    }
}
