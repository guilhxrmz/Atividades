package TrabalhoED;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class KNN {

    public float euclidianDistance(Object p1, Object p2){

        //dados da pessoa 1 ou currentreg
      var  pessoa1 = p1.toString();
        String [] vet = pessoa1.split(",");
        Double heightp1 = Double.parseDouble (vet[0]);
        Integer weightp1 = Integer.parseInt(vet[1]);
        Integer agep1 = Integer.parseInt(vet[2]);
        String classsp1 = vet[3];
        //fim da leitura dos dados

        //dados da pessoa 2 ou target
        var  pessoa2 = p2.toString();
        String [] vet2 = pessoa2.split(",");
        Double heightp2 = Double.parseDouble (vet2[0]);
        Integer weightp2 = Integer.parseInt(vet2[1]);
        Integer agep2 = Integer.parseInt(vet2[2]);
        String classsp2 = vet2[3];
        //fim da leitura dos dados

        //chamando a função para calcular a diferença de altura
        var heightdiference = Mathdiferenceheight(heightp1,heightp2);
        //elevando a segunda potencia
        System.out.println(heightdiference+" diferenca de altura");
        var heightdiferencefinal = Math.pow (heightdiference, 2);


        //chamando a função para calcular a diferença de peso
        var weightdiference = Mathdiferenceweight(weightp1,weightp2);
        System.out.println(weightdiference+" diferenca de peso");
        //elevando a segunda potencia
        var weightdiferencefinal = Math.pow (weightdiference, 2);


        //chamando a função para calcular a diferença de idade
        var agediference = Mathdiferenceage(agep1,agep2);
        System.out.println(agediference+" diferenca de idade");
        //elevando a segunda potencia
        var agediferencefinal = Math.pow (agediference, 2);

        System.out.println("/////////////////////////////////////");

        //fazendo o somatorio
        float diference = (float) (agediferencefinal+heightdiferencefinal+weightdiferencefinal);

        //tirando a raiz quadrada
        float diferencefinal = (float) Math.sqrt(diference);
        //retornando a diferença como um float
        return diferencefinal;
    }
    public Double Mathdiferenceheight ( double heightp1 , double heightp2){
        //cauculos
        if(heightp1<heightp2){
            var heightdiference = heightp2-heightp1;
            return heightdiference;
        }
        if(heightp1>heightp2){
            var heightdiference2 = heightp1-heightp2;
            return heightdiference2;
        }
        else {
            return 0.0;
        }
    }

    public Integer Mathdiferenceweight ( Integer weightp1 , Integer weightp2){
        //cauculos
        if(weightp1<weightp2){
            var weightdiference = weightp2-weightp1;
            return weightdiference;
        }
        if(weightp1>weightp2){
            var weightdiference2 = weightp1-weightp2;
            return weightdiference2;
        }

        return 0;
    }

    public Integer Mathdiferenceage ( Integer agep1 , Integer agep2){
        //cauculos
        if(agep1<agep2){
            var agediference = agep2-agep1;
            return agediference;
        }
        if(agep1>agep2){
            var agediference2 = agep1-agep2;
            return agediference2;
        }

        return 0;
    }

    ///parte 4

    public String classify (LinkedList dataset, int k, Object target){

        LinkedList<NewWorkers> NewDataSet = new LinkedList<NewWorkers>();

        if(k<=0){
            k = 1;
        }

        //dados do target
        var  targetZ = target.toString();
        String [] vet2 = targetZ.split(",");
        Double heightp2 = Double.parseDouble (vet2[0]);
        Integer weightp2 = Integer.parseInt(vet2[1]);
        Integer agep2 = Integer.parseInt(vet2[2]);
        String classsp2 = vet2[3];
        //fim da leitura dos dados

        //chaando o método euclidiano e adicionando ele junto ao
        // registro em uma nova lista
        for(int i = 0;i<dataset.size();i++){
         var data =  dataset.get(i).toString();
         var distance = this.euclidianDistance(target,data);
        String [] vet = data.split(",");
        Float heightp = Float.parseFloat (vet[0]);
        Integer weightp = Integer.parseInt(vet[1]);
        Integer agep = Integer.parseInt(vet[2]);
        String classsp = vet[3];

            var wksNew = new NewWorkers(distance,heightp,weightp,agep,classsp);
            NewDataSet.add(wksNew);

        }
        System.out.println(NewDataSet);
        //termina aqui a adição


        //Organizando pelo Distance
        System.out.println("Segue abaixo o vetor organizado");
        Collections.sort(NewDataSet, (a, b) -> a.getDistance().compareTo(b.getDistance()));;
        System.out.println(NewDataSet);

        this.Recomended(NewDataSet,k);

        return null;
    }

    public List Recomended (LinkedList dataset, int k){

        // verificando os k primeiros registros
        List<String> StringClass = new ArrayList<String>();
        for(int i = 0;i<k;i++) {
            var data = dataset.get(i).toString();
            String[] vet = data.split(",");

            String classsp = vet[4];

            StringClass.add(classsp);
        }


      LinkedHashMap<String,Integer> quantas = new LinkedHashMap<>();
        for ( String palavra : StringClass ) {
            quantas.compute(palavra, (w, v) -> v == null ? 1 : v + 1);
        }

        //pegando o primeiro valor do map, que é o mais frequente nos K's
        var firts = String.valueOf(quantas.entrySet().toArray()[quantas.size() - (quantas.size())]);

        System.out.println(firts+" é a classe que mais aparece e combina com vocês entre K numeros");
        return  null;
    }}
