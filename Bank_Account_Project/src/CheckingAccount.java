public class CheckingAccount extends Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    @Override
    public double balanceInitial(double balance) {
        return this.balance = balance;
    }

    @Override
    public void updateBalance() {
        this.balance += getBalance() * 0.3;
    }
}
