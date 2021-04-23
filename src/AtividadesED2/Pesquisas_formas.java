package AtividadesED2;

public class Pesquisas_formas {

    public int[] agenda = new int[50];
    public int valordentroarray = 100;
    public int tamanhoarray = 50;

    //iniciando posisões do array
    public void posicoes() {
        for(int i = 0; i < tamanhoarray; i++) {
            agenda[i] = valordentroarray;
            valordentroarray++;
        }
    }

    //pesquisa sequencial simples
    public void sequencial ( int numero) {

        for (int i = 0; i < agenda.length; i++) {
            if (numero == agenda[i]) {
            System.out.println("Numero localizado na posição: " + i);
            }
        }
    }

    //pesquisa sequencial ordenada
    //nesta forma de pesquisa o numero pesquisado assume o primeiro lugar e
    //o restante desce uma casa, funciona basicamente como "mais buscados"
    public void sequencialordenada (int numero) {
        valordentroarray = 100;
        boolean boleano = false;
        for (int i = 0; i < agenda.length; i++) {
            if (numero == agenda[i]) {
                System.out.println("Numero localizado na posição: " + i);
                var x = agenda[i];
                System.out.println("realocando dados");
                for (int j = i; j > 0; j--) {
                    i--;
                    agenda[j]=agenda[i];
                    System.out.println(agenda[j]);
                }
                agenda [0] = x;
                System.out.println(agenda[0]);

            }

        }

    }
}
