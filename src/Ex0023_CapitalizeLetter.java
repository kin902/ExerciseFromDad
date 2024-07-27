import java.util.Scanner;

public class Ex0023_CapitalizeLetter {
    public String capitalizeFirstLetter(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return String.join(" ", words);
    }

    public String upperCaseAllLetter(String sentence) {
        return sentence.toUpperCase();
    }

    public String lastWord(String sentence) {
        String[] words = sentence.split(" ");
        return words[words.length - 1];
    }

    public static void main(String[] args) {
        Ex0023_CapitalizeLetter capitalization = new Ex0023_CapitalizeLetter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Capitalize first letter: " + capitalization.capitalizeFirstLetter(sentence));
        System.out.println("Upper case all letter: " + capitalization.upperCaseAllLetter(sentence));
        System.out.println("Lower case all letter: " + capitalization.lastWord(sentence));
    }
}
