public class Program{

    public static void main(String[] args) {

        CheckingAccount c1 = new CheckingAccount();

        c1.balanceInitial(200);
        c1.updateBalance();
        System.out.println(c1.getBalance());

        SavingsAccount c2 =  new SavingsAccount();
        c2.balanceInitial(200);
        c2.updateBalance();
        System.out.println(c2.getBalance());

    }
}
