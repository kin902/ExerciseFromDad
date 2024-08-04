public class Ex0040_Factorial {
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n -1);
    }

    public static void main(String[] args) {
        Ex0040_Factorial factorial = new Ex0040_Factorial();
        System.out.println(factorial.factorial(7));
    }
}
