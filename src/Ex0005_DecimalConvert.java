import java.util.Scanner;


public class Ex0005_DecimalConvert {
    public int decimalConvert(long binary) {
        int result = 0;
        int times = 1;
        while (binary != 0) {
            if (binary % 10 != 1 && binary % 10 != 0) {
                return -1;
            }
            result += (int) (binary % 10) * times;
            binary = binary / 10;
            times *= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Ex0005_DecimalConvert dc = new Ex0005_DecimalConvert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        long num = sc.nextLong();
        long result = dc.decimalConvert(num);
        if (result == -1) {
            System.out.println("Not a valid number");
        } else {
            System.out.println("binary: " + num);
            System.out.println("Decimal: " + result);
        }

    }
}
