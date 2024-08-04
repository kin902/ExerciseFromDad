package Recursive;

public class Ex0048_Recursive07 {
    public int countOdd(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] % 2 + countOdd(arr, index + 1);
    }
    public static void main(String[] args) {
        Ex0048_Recursive07 test = new Ex0048_Recursive07();
        int[] intArray = {4, 7, 9, 2, 3, 1, 5, 7}; // Expect to print 6 odd numbers
        System.out.println(test.countOdd(intArray, 0));
    }
}
