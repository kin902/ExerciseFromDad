public class Ex0001_Swap {
    public int[] Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Ex0001_Swap swap0001 = new Ex0001_Swap();
        int a = 2, b = 4;
        int[] swapped = swap0001.Swap(a, b);

        System.out.print(a + " " + b);
        System.out.print(" swapped to ");
        for (int j : swapped) {
            System.out.print(j + " ");
        }
    }
}
