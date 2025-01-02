package Encapsulation;

public class Ex0116_JavaEncapsulation {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();

        newAccount.setter(918230, 2000);
        newAccount.getter();
    }

    static class BankAccount {
        private int accountNumber;;
        private int balance;

        public void getter() {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }

        public void setter(int accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }
}
