import java.util.Scanner;

public class Ex0021_FindDivisibleNumber {
    public int findDivisibleNumber(int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (i % target == 0 && i != 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Ex0021_FindDivisibleNumber calculators = new Ex0021_FindDivisibleNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end number: ");
        int end = scanner.nextInt();
        System.out.println("Enter the target number: ");
        int target = scanner.nextInt();

        System.out.println(calculators.findDivisibleNumber(start, end, target));
    }
}
