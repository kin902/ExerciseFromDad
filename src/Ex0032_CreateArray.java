import java.util.Arrays;

public class Ex0032_CreateArray {
    public int[] createArray(int[] array1, int[] array2) {
        return new int[] {array1[0], array2[array2.length - 1]};
    }

    public static void main(String[] args) {
        Ex0032_CreateArray createArray = new Ex0032_CreateArray();
        int[] array1 = {1, 6, 9, 7, 8, 4};
        int[] array2 = {5, 6, 3, 4, 7, 8};
        int[] result = createArray.createArray(array1, array2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("New array: " + Arrays.toString(result));
    }
}
