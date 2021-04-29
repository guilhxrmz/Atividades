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
            System.out.println("Encontrou o número no " + i + "° giro!");
            }
        }
    }

    //pesquisa sequencial ordenada
    //nesta forma de pesquisa o numero pesquisado assume o primeiro lugar e
    //o restante desce uma casa, funciona basicamente como "mais buscados"
    public void sequencialordenada (int numero) {
        valordentroarray = 100;

        for (int i = 0; i < agenda.length; i++) {
            if (numero == agenda[i]) {
                System.out.println("Encontrou o número no " + i + "° giro!");
                var x = agenda[i];
                System.out.println("realocando dados");
                for (int j = i; j > 0; j--) {
                    i--;
                    agenda[j]=agenda[i];
                    System.out.print(agenda[j]+", ");
                }
                agenda [0] = x;
                System.out.println(agenda[0]);
            }
        }
    }

    //a pesquisa binaria corta a busca sempre pela metade oque faz com que ela localize itens mais facilmente
    public void binaria (int numero){
            int i = 0;
            int menor = 0;
            int maior = agenda.length - 1;
            int metade;

            while(menor <= maior)
            {
                i++;
                metade =(menor + maior) / 2;

                if(agenda[metade] == numero) {
                    System.out.println("Encontrou o número no " + i + "° giro!");
                    return;
                }
                if(agenda[metade] < numero) {
                    menor = metade + 1;
                }
                else {
                    maior = metade - 1;
                }
            }
    }

    // fim
}
