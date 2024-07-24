import java.util.Scanner;

public class Ex0006_BinaryConvert {
    public String binaryConvert(int num) {
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.insert(0, num % 2);
            num /= 2;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Ex0006_BinaryConvert binaryConvert_0006 = new Ex0006_BinaryConvert();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Integer: " + num);
        System.out.println("Binary: " + binaryConvert_0006.binaryConvert(num));

    }
}
