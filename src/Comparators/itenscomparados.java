package Comparators;

public class itenscomparados implements Comparable <itenscomparados>{
    public int comp1;
    public int comp2;

    public itenscomparados(int original, int teste){
        this.comp1 = original;
        this.comp2 = teste;
    }

    public int getComp1(){
        return comp1;
    }

    public int getComp2(){
        return comp2;
    }

    //essa função é a forma como o print do list vai ser exibido na tela
    public String toString(){return comp1 + " - " + comp2;}

    @Override
    public int compareTo(itenscomparados o) {
        return this.getComp1() - o.getComp1();
    }
}
