public class Atm {
    private int balance;


    public Atm(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amountToDeposit) {
        balance +=amountToDeposit;
    }
}