package AtividadesED3;

public class MetodosDeOrganizacao {

    //metodo booble sort faz a comparação
    //de pares de valores e coloca em ordem esses
    //pares
    public int BubbleSort(int vetor[]){
        int i = 0;
        int aux = 0;

        for(i = 0; i< vetor.length; i++){
            for(int j = 0; j< (vetor.length-1); j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        return 0;
    }

    //O algoritmo de ordenação por Inserção insere determinado
    //valor em sua posição de direito considerando a ordenação
    //da estrutura
    public int SelectionSort(int vetor[]){
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;

            for (int j = menor + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
            }
        }

        System.out.println("Vetor organizado:");
        for(int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        return 0;
    }

    //O algoritmo de ordenação por Inserção insere determinado
    //valor em sua posição de direito considerando a ordenação
    //da estrutura
    public int InsertionSort(int vetor[]){
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }

        System.out.println("Vetor organizado:");
        for(i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        return 0;
    }

}
