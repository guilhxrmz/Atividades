package AtividadesED5;

import java.util.Arrays;

public class AlgoritmosdeOrganizacao {
    public int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        var mostravetor = Arrays.stream(vetor).toArray();
        return mostravetor;
    }

    public static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    public int[] shellSort(int[] vetor) {
        int i, j, h = 1, value;

        do { h = 3 * h + 1;}
        while (h < vetor.length);
        do {
            h = h / 3;
            for (i = h; i < vetor.length; i++) {
                value = vetor[i];
                j = i - h;
                while (j >= 0 && value < vetor[j]) {
                    vetor[j + h] = vetor[j];
                    j = j - h;
                }
                vetor[j + h] = value;
            }
        } while (h > 1);
    return vetor;
    }

    private static void intercala(int[] vetor, int inicio, int meio, int fim) {
        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;

        while(i < meio && m < fim) {
            if(vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }
        while(i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }
        while(m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }

    }


    public int[] mergeSort(int tamanho, int[] vetor) {

        int elementos = 1;
        int inicio, meio, fim;

        while(elementos < tamanho) {
            inicio = 0;

            while(inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;
                if(fim > tamanho)
                    fim = tamanho;
                intercala(vetor, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }
        return vetor;
    }
}
