import java.util.ArrayList;
import java.util.Arrays;

public class Ex0034_MultiplyingElement {
    public int[] multipleElement(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num_index = 0; num_index < array1.length; num_index++) {
            result.add(array1[num_index] * array2[num_index]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Ex0034_MultiplyingElement computer = new Ex0034_MultiplyingElement();
        int[] array1 = {2, 5, -7, 142};
        int[] array2 = {7, 2, -34, 275};
        System.out.println(Arrays.toString(computer.multipleElement(array1, array2)));
    }
}
