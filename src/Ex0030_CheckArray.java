public class Ex0030_CheckArray {
    public boolean isArrayValid(int[] array) {
        return array[0] == 10 || array[array.length - 1] == 10;
    }

    public static void main(String[] args) {
        Ex0030_CheckArray test = new Ex0030_CheckArray();
        System.out.println(test.isArrayValid(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
