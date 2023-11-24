package xmut.experiment.ch08;

/**
 * @author 朔风
 * @date 2023-11-24 10:32
 */
public class Account {

    private double balance;

    private String name;

    private long acctNum;

    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", acctNum=" + acctNum +
                '}';
    }

    public double chargeFee() {
        this.balance -= 10;
        return this.balance;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}
