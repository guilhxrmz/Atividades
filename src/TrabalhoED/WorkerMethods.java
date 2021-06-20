package TrabalhoED;

import java.util.LinkedList;
import java.util.List;


    public class WorkerMethods {
    ////pegando informações da pessoa da lista
    public Object LineList(List workerlist,int x){
        var linha  = (workerlist.get(x));
        System.out.println(linha);

        return linha;
    }

    //transformando list em linkedlist como pede o programa
    public static <T> LinkedList<T> ChangeToLinkedList(List<T> ArrayList)
    {
        LinkedList<T> linkedList = new LinkedList<>();

        for (T e: ArrayList) {
            linkedList.add(e);
        }
        return linkedList;
    }


}
