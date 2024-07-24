import java.util.Scanner;

public class Ex0011_AsciiValue {
    public int ASCIIValue (char character) {

        return (int) character;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex0011_AsciiValue av = new Ex0011_AsciiValue();

        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        System.out.println("ASCII value of " + character + " : " + av.ASCIIValue(character));
    }
}
