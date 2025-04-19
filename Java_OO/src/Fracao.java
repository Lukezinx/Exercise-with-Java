public class Fracao {
    Integer teste;
    Integer teste2;


    public Fracao( int num, int den) {
         this.teste = num;
         this.teste2 = den;
    }

    public void multiply(int numero, int numero2) {
        teste = teste * numero;
        teste2 = teste2 * numero2;
        System.out.println(teste + "/" + teste2);

    }
}