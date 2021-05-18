package AtividadesED5;

public class progprincp {

    public static void main(String[] args) {
        int [] vetor= new int[]{15,20,0,9,541,169,221,122,5,3,80};
        AlgoritmosdeOrganizacao algoritmosdeOrganizacao = new AlgoritmosdeOrganizacao();

        var print = algoritmosdeOrganizacao.quickSort(vetor,0,vetor.length-1);
        for(int i = 0; i<print.length;i++){
        System.out.print(print[i]+ " ,");
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////");

        var printshell = algoritmosdeOrganizacao.shellSort(vetor);
        for(int i = 0; i<printshell.length;i++){
            System.out.print(printshell[i]+ " ,");
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////");

        var printmerger = algoritmosdeOrganizacao.mergeSort(vetor.length,vetor);
        for(int i = 0; i<printmerger.length;i++){
            System.out.print(printmerger[i]+ " ,");
        }
}
}
