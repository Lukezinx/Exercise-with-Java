import java.util.Arrays;

public class Program {

    public static  void main(String[] args) {

        Itens[] itens = new Itens[]{new  Itens ("PC",10), new Itens("Rice", 40), new Itens("Bread", 3)};
        Itens p = new Itens();
        Object[] resoult = p.extrating(itens);

        Itens highestPrice = (Itens) resoult[0];
        Itens lowestPrice = (Itens) resoult[1];
        Double avg = (Double) resoult[2];


        System.out.println("max " + highestPrice );
        System.out.println("min " + lowestPrice );
        System.out.println("avg " + avg );
    }
}
