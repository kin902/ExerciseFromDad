import java.util.Scanner;

public class Ex0029_FormatString {
    public void formatString(String str1, String str2) {
        str1 = str1.replace(str1.charAt(0), ' ');
        str1 = str1.strip();
        str2 = str2.replace(str2.charAt(0), ' ');
        str2 = str2.strip();
        System.out.println(str1 + str2);
    }

    public static void main(String[] args) {
        Ex0029_FormatString formater = new Ex0029_FormatString();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter a string 2: ");
        String str2 = scanner.nextLine();

        System.out.println();
        formater.formatString(str1, str2);
    }
}
