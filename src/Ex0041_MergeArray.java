import java.util.Arrays;

public class Ex0041_MergeArray {
    public int[] merge (int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return Arrays.stream(result).sorted().toArray();
    }

    public static void main(String[] args) {
        Ex0041_MergeArray mergeArray = new Ex0041_MergeArray();
        int[] arr1 = {6, 8, 4, 9, 2, 5};
        int[] arr2 = {0, 7, 5, 2, 1, 4, 3, 5};
        int[] result = mergeArray.merge(arr1, arr2);

        System.out.print(Arrays.toString(Arrays.stream(result).toArray()));
    }
}
