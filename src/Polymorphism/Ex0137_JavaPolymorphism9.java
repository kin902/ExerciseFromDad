package Polymorphism;

public class Ex0137_JavaPolymorphism9 {
    public static void main(String[] args) {

    }

    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (amount < this.balance) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}
// 1996
