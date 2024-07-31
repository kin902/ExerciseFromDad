public class Ex0037_CountOddAndEven {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Ex0037_CountOddAndEven program = new Ex0037_CountOddAndEven();

        int[] arr = {3, 6, 8, 7, 4, 9, 6, 8, 3, 2};
        int oddCount = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (program.isEven(num)) evenCount++;
            else oddCount++;
        }
        System.out.println("There are " + evenCount + " even numbers in the array");
        System.out.println("There are " + oddCount + " odd numbers in the array");
    }
}
