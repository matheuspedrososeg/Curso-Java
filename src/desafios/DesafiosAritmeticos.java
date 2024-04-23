package desafios;


import java.sql.SQLOutput;

public class DesafiosAritmeticos {
    public static void main(String[] args) {

        //colchete 1
        double colchete1 = 6 * (3 + 2);
        double colchete12 = Math.pow(colchete1, 2);
        double colchete123 = (colchete12 / (3 * 2));
        //colchete 2

        double col2 = (1-5) * (2-7);
        double col23 = col2 / 2;
        double col234 = Math.pow(col23, 2);

        double colsub = (colchete123 - col234);

        double colpow = (Math.pow(colsub , 3));

        double colsubpow =(colpow / 1000);

        System.out.println(colsubpow);

    }
}
