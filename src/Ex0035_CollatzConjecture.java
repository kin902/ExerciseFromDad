import java.util.Scanner;

public class Ex0035_CollatzConjecture {
    public boolean isCollatz(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else if (n % 2 == 1) {
                n /= 3;
                n += 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Ex0035_CollatzConjecture collatzConjecture = new Ex0035_CollatzConjecture();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(collatzConjecture.isCollatz(num));

    }
}
