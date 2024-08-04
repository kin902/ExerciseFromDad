package Recursive;

public class Ex0046_Recursive05 {
    public int power(int base, int power) {
        if (power == 1) return 1;
        return base;
    }

    public static void main(String[] args) {
        Ex0046_Recursive05 test = new Ex0046_Recursive05();
        System.out.println(test.power(8, 4));
    }
}
