import java.util.Scanner;
public class Ex0013_ComputesNValue {
    public void computeNValue(int n) {
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

    }
    public static void main(String[] args) {
        Ex0013_ComputesNValue cnv = new Ex0013_ComputesNValue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = scanner.nextInt();
        cnv.computeNValue(num);
    }
}
