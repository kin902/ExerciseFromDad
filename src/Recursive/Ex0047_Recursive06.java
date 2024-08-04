package Recursive;

public class Ex0047_Recursive06 {
    public String reverseString(String string, int index) {
        if (index > string.length() / 2) return string;

        char tempChar = string.charAt(index);
        String result = string;
        char lastChar = string.charAt(string.length() - 1 - index);

        result = result.replace(lastChar, 'o');
        result = result.replace(string.charAt(index), lastChar);
        result = result.replace('o', tempChar);

        return reverseString(result, index + 1);
    }
    public static void main(String[] args) {
         System.out.println(new Ex0047_Recursive06().reverseString("123456789", 0));
    }
}
