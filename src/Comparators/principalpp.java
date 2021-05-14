package Comparators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class principalpp {
    public static void main(String[] args) {
        //adicionando numeros
        //por algum motivo funciona mas está aparecendo como se ouvesse algo
        //errado ao adicionar, mas ta funcionando normalmente
        List<itenscomparados> comparadores = new ArrayList<>();
        comparadores.add(new itenscomparados(22,25));
        comparadores.add(new itenscomparados(28,98));
        comparadores.add(new itenscomparados(24,30));
        comparadores.add(new itenscomparados(29,50));
        //ordem natural
        System.out.println("Ordem de inserção");
        System.out.println(comparadores);

        //ordem do primeiro numero
        comparadores.sort((first, second) -> first.getComp1() - second.getComp1());
        System.out.println("Ordem do numero original");
        System.out.println(comparadores);

        //ordem do segundo numero
        comparadores.sort((first, second) -> first.getComp2() - second.getComp2());
        System.out.println("Ordem do teste");
        System.out.println(comparadores);

        //ordem reversa do primeiro numero
        comparadores.sort(Comparator.comparingInt(itenscomparados::getComp1));
        System.out.println("Ordem reversa do original");
        System.out.println(comparadores);

        //ordem reversa do seguundo numero
        comparadores.sort(Comparator.comparingInt(itenscomparados::getComp2));
        System.out.println("Ordem reversa do teste");
        System.out.println(comparadores);
        

    }
}
