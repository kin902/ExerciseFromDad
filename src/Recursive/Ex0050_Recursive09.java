package Recursive;

public class Ex0050_Recursive09 {
    public int totalOdd(int[] arr, int index) {
        if (index == arr.length) return 0;
        else if (arr[index] % 2 == 1) return arr[index] + totalOdd(arr, index + 1);
        return totalOdd(arr, index + 1);
    }

    public static void main(String[] args) {
        Ex0050_Recursive09 machine = new Ex0050_Recursive09();

        int[] arr = {4, 7, 2, 9, 8, 7, 1, 4, 6}; // Expect to print 24

        System.out.println(machine.totalOdd(arr, 0));
    }
}
