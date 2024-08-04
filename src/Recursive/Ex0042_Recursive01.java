package Recursive;

import java.util.Scanner;

public class Ex0042_Recursive01 {
    public int allSum(int min, int max) {
        return ((max - min) + 1) * (min + max) / 2;
    }

    public static void main(String[] args) {
        Ex0042_Recursive01 computer = new Ex0042_Recursive01();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int startNum = scanner.nextInt();
        System.out.println("Enter the end number: ");
        int endNum = scanner.nextInt();

        int result = computer.allSum(startNum, endNum);

        System.out.println(result);
    }
}
