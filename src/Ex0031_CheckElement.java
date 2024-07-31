public class Ex0031_CheckElement {
    public boolean isElementEqual(int[] array1, int[] array2) {
        return array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1];
    }

    public boolean isFirstLastEqual(int[] array1) {
        return array1[0] == array1[array1.length - 1];
    }

    public static void main(String[] args) {
        Ex0031_CheckElement checker = new Ex0031_CheckElement();
        int[] array1 = {2, 3, 6, 2, 3};
        int[] array2 = {2, 5, 7, 4, 6};

        System.out.println(checker.isElementEqual(array1, array2));
        System.out.println(checker.isFirstLastEqual(array1));
    }
}
