import java.util.Arrays;

public class Ex0033_RotateArray {
    public int[] rotate(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        Ex0033_RotateArray rotateArray = new Ex0033_RotateArray();
        int[] array1 = {2, 4, 5, 7, 9};
        System.out.println(Arrays.toString(rotateArray.rotate(array1)));
    }
}
