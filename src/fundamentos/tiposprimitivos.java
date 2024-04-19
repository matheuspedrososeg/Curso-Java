package fundamentos;

public class tiposprimitivos {
    public static void main(String[] args) {
        // informacoes do funcionario

        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 2134845223;

        // tipos numericos reais
        float salario = 11445.44f;
        //float numero termina com f, caso nao coloque, sera identificado como double
double vendasAcumuladas = 2991797103.01;

// tipo booleano
        boolean estaDeFerias = false;
        // tipo caractere
        char status = 'A';

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //numero de viagens

        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha ->" + salario);
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("status:" + status);

    }
}
