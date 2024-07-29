import java.util.Scanner;

public class Ex0024_ReverseAWord {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        for (char c : s.toCharArray()) {
            output.insert(0, c);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Ex0024_ReverseAWord reverseWord = new Ex0024_ReverseAWord();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word =  scanner.nextLine();
        System.out.println(word + " After reverse: " + reverseWord.reverseWords(word));
    }
}
