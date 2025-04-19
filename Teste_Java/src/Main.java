
import java.util.Scanner;
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("qual o numero da tabuada?  ");
        int quantiny = sc.nextInt();
        for(int i = 0; i <= 10;i++) {
            int calc = quantiny * i;
            System.out.println(quantiny + "x" + i + '=' + calc );
        }

        







    }
