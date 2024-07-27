import java.util.LinkedList;

public class Ex0018_DivisibleBy3Or5 {

    public String divisibleBy(int num1) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int num = 0; num < 100; num++) {
            if (num % num1 == 0 && num != 0) {
                result.add(num);
            }
        }
        return result.toString();
    }

    public String divisibleBy(int num1, int num2) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int num = 0; num < 100; num++) {
            if (num % num1 == 0 && num % num2 == 0 && num != 0) {
                result.add(num);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Ex0018_DivisibleBy3Or5 dbo = new Ex0018_DivisibleBy3Or5();

        System.out.println("Divisible by 3: ");
        System.out.println(dbo.divisibleBy(3));
        System.out.println("Divisible by 5: ");
        System.out.println(dbo.divisibleBy(5));
        System.out.println("Divisible by 3 nad 5: ");
        System.out.println(dbo.divisibleBy(3, 5));
    }
}
