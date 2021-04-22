package AtividadesED;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class atvconjunto {

    int tamanho = 40;

    //criando um array com linked list
    private ArrayList<LinkedList<String>>alunos = new ArrayList<LinkedList<String>>();

    //iniciando as posições da tabela com linked list
    public void posicoesalunos() {
        for(int i = 0; i < tamanho; i++) {
            this.alunos.add( new LinkedList() );
        }
    }

    //gerando a lista alunos registrados
    public LinkedList<String> listaalunos() {
        LinkedList<String> listadealunos = new LinkedList();
        for(int i = 0; i < this.alunos.size(); i++) {
            listadealunos.addAll(this.alunos.get(i) );
        }
        return listadealunos;
    }

    //caucula a posição da variavel
    private int calcularPosicao(String nome){
        int ascii = nome.toLowerCase().charAt(0);
        return ascii % 26;
    }

    //checando se o aluno está na lista para remover ou adicionar
    //o metodo serve apenas para o adicionando e removendo se basearem
    public boolean matriculado(String nome) {
        int codigo = calcularPosicao(nome);
        LinkedList lista = this.alunos.get(codigo);
        return lista.contains(nome);
    }
    //adicionando aluno
    public void adicionar(String nome){
        if (!matriculado(nome)) {
            int codigo = calcularPosicao(nome);
            LinkedList listadealunos = this.alunos.get(codigo);
            listadealunos.add(nome);
            System.out.println("adicionando");
        }
    }

    //removendo aluno
    public void remover(String nome){
        if (matriculado(nome)) {
            int codigo = calcularPosicao(nome);
            LinkedList listadealunos = this.alunos.get(codigo);
            listadealunos.remove(nome);
            System.out.println("removendo");
        }
        else{
            System.out.println("Aluno não encontrado");
        }
    }
    //essa função retorna se o aluno está matriculado ou não
    public String checandomatricula (String nome){
        String resp ="Aluno Matriculado";
        String respn ="Aluno não Matriculado";
        //chamando a lista
       var lista = listaalunos();
       //convertendo ela de linked list para array para fazer a comparação
        Object[] array = lista.toArray();
        //aqui a comparação
    for(int i = 0; i < array.length; i++) {
        if (nome.equals(array[i])) {
        return resp;
        }
    }
    return respn;
    }

    //está função retira um nome e coloca outro, ela não "substitui" porque o linkedlist
    //deixa em ordem alfabetica em sua organização então não achei que faria sentido substituir
    //se ele vai reorganizar sozinho depois
 public void editandoarray (String nomev, String novonome){
     if (matriculado(nomev)) {
        this.remover(nomev);
        this.adicionar(novonome);
     }
     
 }
}
