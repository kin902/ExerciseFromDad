package OOP;

public class Ex0086_OOP05 {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("BA1234");
        SavingsAccount student1 = new SavingsAccount("CD5678");

        user1.deposit(1000);
        student1.deposit(300);
        System.out.println("Withdraw: " + user1.withdraw(1500) + "$\n");

        System.out.println("Withdraw: " + student1.withdraw(250) + "$\n");

        System.out.println("Account " + user1.getAccountID() + " balance: " + user1.getBalance() + "$");
        System.out.println("Account " + student1.getAccountID() + " balance: " + student1.getBalance() + "$\n");

        System.out.println("Withdraw: " + user1.withdraw(1000) + "$\n");

        System.out.println("Withdraw: " + student1.withdraw(150) + "$\n");

        System.out.println("Account " + user1.getAccountID() + " balance: " + user1.getBalance() + "$");
        System.out.println("Account " + student1.getAccountID() + " balance: " + student1.getBalance() + "$\n");
    }
}

class BankAccount {
    private double balance;
    private final String AccountID;

    public BankAccount(String AccountID) {
        balance = 0;
        this.AccountID = AccountID;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
            return 0.0;
        } else {
            balance -= amount;
            return amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountID() {
        return AccountID;
    }
}

class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(String AccountID) {
        super(AccountID);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance - amount < 100.0) {
            System.out.println("Minimum balance of $100.00 required!");
        } else {
            return balance - amount;
        }
        return 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountID() {
        return super.getAccountID();
    }
}