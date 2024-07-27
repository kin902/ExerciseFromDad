import java.util.Scanner;

public class Ex0022_CountFactors {
    public int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0 ) count++;
        }
        return ++count;
    }

    public static void main(String[] args) {
        Ex0022_CountFactors countFactors = new Ex0022_CountFactors();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();

        System.out.println(countFactors.countFactors(num));
    }
}
