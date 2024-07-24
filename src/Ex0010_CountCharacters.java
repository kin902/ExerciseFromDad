import java.util.Scanner;

public class Ex0010_CountCharacters {

    public static void main(String[] args) {
        int intCount = 0;
        int stringCount = 0;
        int spaceCount = 0;
        int otherCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = scanner.nextLine();

        for (char c : string.toLowerCase().toCharArray()) {
            switch (c) {
                case ' ':
                    spaceCount++;
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    intCount++;
                    break;
                case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                     'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
                    stringCount++;
                    break;
                default:
                    otherCount++;
                    break;

            }
        }

        System.out.println("letters: " + intCount);
        System.out.println("numbers: " + stringCount);
        System.out.println("others: " + stringCount);
        System.out.println("spaces: " + stringCount);

    }
}
