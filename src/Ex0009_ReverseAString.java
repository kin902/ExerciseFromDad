import java.util.Scanner;

public class Ex0009_ReverseAString {
    public String reverseAString(String s) {
        StringBuilder output = new StringBuilder();
        for (char c : s.toCharArray()) {
            output.insert(0, c);
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex0009_ReverseAString ras = new Ex0009_ReverseAString();

        System.out.println("Input a String: ");
        System.out.println("After Reverse: " + ras.reverseAString(scanner.nextLine()));
    }
}
