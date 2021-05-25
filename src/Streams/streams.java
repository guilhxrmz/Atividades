package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("fulano");
        estudantes.add("cicrano");
        estudantes.add("rylari");
        estudantes.add("taina");
        estudantes.add("kinoa");
        estudantes.add("showshow");
        estudantes.add("balela");

        //contagem de elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        //retorna o maior elemento
        System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //retorna o menor elemento
        System.out.println("menor nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna o nome que tem o elemento
        System.out.println("o nome que tem o elemento x: "
        + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r"))
        .collect(Collectors.toList()));

        //retorna o nome e o numero de letras
        System.out.println("Nome e numero de letras: " + estudantes.stream().map(estudante ->
        estudante.concat(" - ").contains(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna só as primeiras 3 letras
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).
        collect(Collectors.toList()));

        //exibe cada elemento e depois retorna a mesma coleção
        System.out.println("retorna os elementos: " + estudantes.stream().
        peek(System.out::println).collect(Collectors.toList()));

        //exibe sem retornar
        System.out.println("mostra sem retornar os elementos: ");
        estudantes.stream().forEach(System.out::println);

        //retorna true se todos os elementos tem um caractere x
        System.out.println("retornando elementos que tem a letra a" + estudantes.stream().allMatch((elemento)
        -> elemento.contains("a")));

        //retornando o primeiro elemento da coleção
        System.out.println("primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        
    }
}
