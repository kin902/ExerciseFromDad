package Encapsulation;

public class Ex0126_JavaEncapsulation {
    public static void main(String[] args) {
        Account account = new Account();

        account.setter("Ng09H11523", "John", 2000);

        account.getter();
        account.deposit(1000);
        account.withdraw(2000);
        account.getter();
    }

    static class Account {
        private String accountNumber;
        private String accountHolder;
        private int balance;

        public void setter(String accountNumber, String accountHolder, int balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void getter() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $ " + balance);
        }

        public void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        }

        public void withdraw(int amount) {
            if (amount < balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }
}
