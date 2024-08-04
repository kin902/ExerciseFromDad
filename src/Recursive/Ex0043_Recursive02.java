package Recursive;

import java.util.Scanner;

public class Ex0043_Recursive02 {
    public int fibonacci(int nth, int a, int b) {
        if (nth == 0) return (a + b);
        int c = a + b;
        return fibonacci(nth - 1, b, c);
    }

    public static void main(String[] args) {
        Ex0043_Recursive02 computer = new Ex0043_Recursive02();
        Scanner scanner = new Scanner(System.in);
        System.out.println("The 1 nth term is 2 and term 2 is 3");
        System.out.print("Enter the nth term of a fibonacci number: ");
        int nth = scanner.nextInt();

        System.out.println("The fibonacci's " + nth + " term is: " + computer.fibonacci(nth, 0, 1));
    }
}
