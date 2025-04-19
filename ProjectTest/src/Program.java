import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("voce deseja se cadastar no programa?");
        String choose = sc.nextLine();

        if(choose.equals("sim")) {
            System.out.println("digite seu nome: ");
            String name = sc.nextLine();
            System.out.println("digite seu numero: ");
            Integer number = sc.nextInt();
            System.out.println("digite seu CPF: ");
            String cpf = sc.nextLine();

            JustTest Jt = new JustTest(name, number,cpf);



        }
        else {
            System.exit(0);
        }

    }
}
