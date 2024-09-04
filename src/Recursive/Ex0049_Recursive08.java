package Recursive;

public class Ex0049_Recursive08 {
    public int countElement(int[] arr, int element, int index) {

        if (arr.length == index) return 0;
        if (arr[index] == element) return 1 + countElement(arr, element, index + 1);

        return countElement(arr, element, index + 1);
    }

    public static void main(String[] args) {
        Ex0049_Recursive08 obj = new Ex0049_Recursive08();
        int[] arr = {4, 1, 2, 6, 5, 8, 4, 2, 3, 6, 4};

        System.out.println(obj.countElement(arr, 4, 0));
    }
}
