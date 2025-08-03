package Task_6;
public class Account {
    @SuppressWarnings("unused")
	private String name;
    private double balance;

    public Account() {
        name = "";
        balance = 0.0;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
