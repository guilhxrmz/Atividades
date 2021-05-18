package AtividadesED4;

import java.util.ArrayList;

public class Atividades {

    public int retornaproduto(int[] vetor) {
        //inicializando o produto
        int produto = 1;
        //criando uma copia localdo vetor
        var vetorlocal = vetor;

        for (int i = 0; i < vetorlocal.length; i++) {
            //guardando o numero atual na variavel
            int numeroatual = vetorlocal[i];
            //fazendo o calculo
            produto = produto * numeroatual;
            //verificando se o vetor esta passando
            System.out.println("passando");
        }
        return produto;
    }

    public int mdc(int x, int y) {
        int MDC = 0;
        int xlocal = x;
        int ylocal = y;
        if (xlocal > ylocal) {
            MDC = xlocal - ylocal * ylocal;
        }
        if (xlocal == ylocal) {
            MDC = xlocal;
        } else {
            MDC = ylocal * xlocal;
        }

        return MDC;
    }

    public int modulo(int x, int y) {
        int mod = 0;
        int xlocal = x;
        int ylocal = y;
        if (xlocal > ylocal) {
            mod = xlocal - ylocal * ylocal;
        }
        if (xlocal < ylocal) {
            mod = xlocal;
        }
        if (xlocal == ylocal) {
            mod = 0;
        }
        return mod;
    }

}
