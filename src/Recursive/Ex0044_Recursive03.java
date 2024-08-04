package Recursive;

import java.util.Scanner;

public class Ex0044_Recursive03 {
    public boolean isPalindrome(String string, int start) {
        if (string.length() % 2 == 1) return false;
        if (start == string.length() / 2) return true;
        boolean isPalindrome = string.charAt(start) == string.charAt(string.length() - 1 - start);

        return isPalindrome && isPalindrome(string, start + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex0044_Recursive03 calculator = new Ex0044_Recursive03();

        System.out.print("Input a String to check if it is palindrome: ");
        String string = scanner.nextLine();
        System.out.println(calculator.isPalindrome(string, 0));
    }
}