import java.util.ArrayList;

public class BinaryCalculator_0004 {
    public ArrayList<Short> addBinary(long binary1, long binary2) {
        ArrayList<Short> sum = new ArrayList<>();
        short carry = 0;

        while (binary1 != 0 || binary2 != 0) {
            short cal = (short)(binary1 % 10 + binary2 % 10 + carry);
            sum.add((short)(cal % 2));
            carry = (short)(cal / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (carry != 0) {
            sum.add(carry);
        }

        return sum;
    }

    public static void main(String[] args) {
        BinaryCalculator_0004 binaryCalculator = new BinaryCalculator_0004();
        long binary1 = 10010101;
        long binary2 = 1111101000;
        ArrayList<Short> result = binaryCalculator.addBinary(binary1, binary2);
        StringBuilder printVal = new StringBuilder();
        for (Short s : result) {
            printVal.insert(0, s);
        }
        System.out.println(printVal);
    }
}
