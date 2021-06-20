package TrabalhoED;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class menu {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        List<Workers> workersList = new ArrayList<Workers>();
            WorkerMethods workerm = new WorkerMethods();
            KNN knn = new KNN();
            System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("////////////////PARTE 1 LENDO OS ARQUIVOS ///////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////");

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Spyke~delas\\Documents\\GitHub\\Atividades\\src\\TrabalhoED\\Dataset.txt"));
            String str;
            str = in.readLine();
            while ((str = in.readLine()) != null) {

                System.out.println(str);
                String [] vet = str.split(",");
                Float height = Float.parseFloat (vet[0]);
                Integer weight = Integer.parseInt(vet[1]);
                Integer age = Integer.parseInt(vet[2]);
                String classs = vet[3];
                var wks = new Workers(height,weight,age,classs);
                workersList.add(wks);

            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////PARTE 2, ARMAZENEI NO LIST WORKERLIST ///////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(workersList);
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("////////////////PARTE 3, CONVERTI EM STRING E ///////////////////");
        System.out.println("////////////LI COM SPLIT PARA FAZER OS CALCULOS /////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////");
        var currentReg = workerm.LineList(workersList, 8);
        var  target  = workerm.LineList(workersList, 4);
        var diference = knn.euclidianDistance(currentReg,target);
        System.out.println(diference);

        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("///////////PARTE 4, ORGANIZEI PELO DISTANCE//////////////////////");
        System.out.println("///////////E PRINTEI O NOME MAIS/////////////////////////////////");
        System.out.println("///////////FREQUENTE ENTRE N K'S/////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////");
        var list = workerm.ChangeToLinkedList(workersList);

        knn.classify(list,6,target);

    }
}
