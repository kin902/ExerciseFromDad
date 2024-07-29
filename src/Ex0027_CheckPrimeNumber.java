import java.util.Scanner;

public class Ex0027_CheckPrimeNumber {
    public boolean isPrime(int num) {
        if (num < 1) return false;
        else if (num <= 3) return true;
        return (num * num - 1) % 24 == 0;
    }
    public static void main(String[] args) {
        Ex0027_CheckPrimeNumber check = new Ex0027_CheckPrimeNumber();
        int sum = 0;
        for (int num = 0; num <= 100; num ++) {
            if (check.isPrime(num)) sum += num;
        }
        System.out.println("The sum of first 100 prime numbers: " + sum);
    }
}
