public class Atm {

    private int balance;
    private String pin;

    //constructor/object/ATM
    public Atm(int balance, String s) {
        this.balance = balance;
    }

    //getter to get the balance when called
    public int getBalance() {
        return balance;
    }

    //methods of behavior or how the object (ATM) behaved
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= balance)
            balance -= amountToWithdraw;
    }

    public boolean accessAccount(String pinEntered) {
        if (pinEntered.equals(pin)) {
            return true;
        } else {
            return false;
        }
    }
}
