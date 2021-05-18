package AtividadesED3;

import java.time.LocalDate;

public class principalp {

    public static void main(String[] args) {

        int [] vetor= new int[]{1, 5, 9,2,4,6,8,0};
        //chamando a classe
        MetodosDeOrganizacao metodosDeOrganizacao = new MetodosDeOrganizacao();
        CartãoDeCredito cartãoDeCredito = new CartãoDeCredito();
        //usando o metodo bubblesort
        metodosDeOrganizacao.BubbleSort(vetor);

        metodosDeOrganizacao.SelectionSort(vetor);

        metodosDeOrganizacao.InsertionSort(vetor);

        LocalDate dataManipulacao = LocalDate.now();
        cartãoDeCredito.addcartao("Luis Ricardo", LocalDate.now());

        cartãoDeCredito.addcartao("André Silva", dataManipulacao.minusDays(5));

        cartãoDeCredito.addcartao("Aline Moraes", dataManipulacao.plusDays(15));

        cartãoDeCredito.addcartao("Julia Motta", dataManipulacao.plusDays(12));

        cartãoDeCredito.addcartao("Alex Braga", dataManipulacao.plusDays(18));

        var ordenado = cartãoDeCredito.organizaporvalidade();

    }
}
