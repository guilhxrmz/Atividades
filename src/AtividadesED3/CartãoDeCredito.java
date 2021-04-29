package AtividadesED3;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CartãoDeCredito {


    int tamanho = 3;
    private Map<LocalDate, String> Mapcartao = new HashMap<LocalDate, String>();

    public void addcartao(String nome, LocalDate data) {
        //adicionando a data de vencimento e o usuario
        Mapcartao.put(data, nome);
    }


    public LinkedHashMap organizaporvalidade() {
        //organizando as datas do menor para o maior
        LinkedHashMap<LocalDate, String> mapaordenado = Mapcartao.entrySet() //
                .stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,(key, content) -> content,
                LinkedHashMap::new));
        //printando o mapa ordenado
        System.out.println(mapaordenado);
        //retornando para o usuario
        return mapaordenado;

    }
    public void printamap(){
    //chamando a ordenação e printando
    var mapaordenado = this.organizaporvalidade();
    System.out.println(mapaordenado);

    }
}
