import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("digite dois numero: ");

        int numberOne;
        int numberTwo;
        try {
            numberOne = Integer.parseInt(sc.nextLine());
            numberTwo = Integer.parseInt(sc.nextLine());
            ContSum cont = new ContSum(numberOne, numberTwo);
            System.out.println(cont.sumNumbers());
        }
        catch (ContSumException | NumberFormatException  e) {
            System.out.println("atattencion, you wrote nothing in the spaces, so the numbers recive  valors 10 ");
            ContSum cont = new ContSum(10, 10);
            System.out.println(cont.sumNumbers());
        }

        
    }


}
