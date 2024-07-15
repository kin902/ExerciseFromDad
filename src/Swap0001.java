public class Swap0001 {
    public int[] Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Swap0001 swap0001 = new Swap0001();
        int a = 2, b = 4;
        int[] swapped = swap0001.Swap(a, b);

        System.out.print(a + " " + b);
        System.out.print(" swapped to ");
        for (int j : swapped) {
            System.out.print(j + " ");
        }
    }
}
