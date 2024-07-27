import java.util.Scanner;

public class Ex0017_OddOrEven {
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static void main(String[] args) {
        Ex0017_OddOrEven ooe = new Ex0017_OddOrEven();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if (ooe.isOdd(num)) System.out.print("0");
        else System.out.print("1");

    }
}
