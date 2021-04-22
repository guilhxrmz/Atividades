package AtividadesED;

public class programa_principal {

    public static void main(String[] args) {
        // write your code here

        //chamando a classe dos alunos
        atvconjunto classealunos = new atvconjunto();

        //inicializando as posições do vetor
        classealunos.posicoesalunos();
        //adicionando alunos
        classealunos.adicionar("Algusto Limeira");
        classealunos.adicionar("Alexander Alves");
        classealunos.adicionar("Bruno Dias");
        //adicionando nome igual pra ver se ele duplicaria o nome
        classealunos.adicionar("Bruno Dias");
        classealunos.adicionar("Aline Radidie");

        //chamando e printando a lista
        var lista = classealunos.listaalunos();
        System.out.println(lista);

        //removendo um aluno
        classealunos.remover("Alexander Alves");

        //mostrando a lista atualizada
        lista = classealunos.listaalunos();
        System.out.println(lista);

        //checando se o aluno está matriculado ou não
        var matriculado_ou_nao = classealunos.checandomatricula("asdvdfv");
        System.out.println(matriculado_ou_nao);

        classealunos.editandoarray("Aline Radidie","Akine Souza");

        lista = classealunos.listaalunos();
        System.out.println(lista);

    }
}
