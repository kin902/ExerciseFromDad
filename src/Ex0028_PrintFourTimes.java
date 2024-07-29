import java.util.Scanner;

public class Ex0028_PrintFourTimes {
    public void printFourTimes(String string) {
        char[] chars = string.toCharArray();
        for (int o = 0; o < 4; o++) {
            for (int i = chars.length - 3; i < chars.length; i++) {
                System.out.print(chars[i]);
            }

        }
    }
    public static void main(String[] args) {
        Ex0028_PrintFourTimes printer = new Ex0028_PrintFourTimes();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String string = scanner.nextLine();
        printer.printFourTimes(string);
        scanner.close();
    }
}
