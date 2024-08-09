package Class;

public class Ex0062_Class06 {
    static class Account {
        String AccountNumber;
        double balance;

        public Account(String accountNumber, double balance) {
            if (accountNumber.isEmpty()) {
                System.out.println("Validation fails: account number invalid");
            }
            if (balance < 0) {
                System.out.println("Validation fails: balance invalid");
            }
            else {
                this.AccountNumber = accountNumber;
                this.balance = balance;
            }

        }

        public String toString() {
            return "Account Number: " + AccountNumber + ", Balance: " + balance + "$";
        }

    }

    public static void main(String[] args) {
        Account user = new Account("1234", 100);
        System.out.println(user);

    }
}
