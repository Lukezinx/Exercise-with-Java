import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        Fracao teste = new Fracao(num, num2);

        teste.multiply(num,num2);



    }
}