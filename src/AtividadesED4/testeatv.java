package AtividadesED4;

public class testeatv {

    public static void main(String[] args) {
        int [] vetor= new int[]{1,2,3,4,5};
        //chamando a classe
        Atividades atividades = new Atividades();
        //testando o método
        var produto = atividades.retornaproduto(vetor);
        //printando
        System.out.println(produto);

        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////");

        //testando função do maximo divisor comum com numeros distintos
        // o y sendo maior
        var mdcy = atividades.mdc(5,10);
        //printando
        System.out.println(mdcy);

        //testando função do maximo divisor comum com numeros iguais
        var mdcigual = atividades.mdc(5,5);
        //printando
        System.out.println(mdcigual);

        //testando função do maximo divisor comum com numeros diferentes porém
        // o x sendo maior
        var mdcx = atividades.mdc(10,5);
        //printando
        System.out.println(mdcx);

        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////");

        //testando função do modulo com numeros distintos
        // o y sendo maior
        var mody = atividades.modulo(5,10);
        //printando
        System.out.println(mody);

        //testando função do modulo com numeros iguais
        var modigual = atividades.modulo(5,5);
        //printando
        System.out.println(modigual);

        //testando função do modulo comum com numeros diferentes porém
        // o x sendo maior
        var modx = atividades.modulo(10,5);
        //printando
        System.out.println(modx);


    }
}
