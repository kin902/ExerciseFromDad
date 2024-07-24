import java.lang.Math;
import java.util.Scanner;

public class Ex0007_HexagonArea {
    public double hexagonArea(double N) {
        return (6 * (N * N)) /(4* Math.tan(Math.PI / 6));
    }
    public static void main(String[] args) {
        Ex0007_HexagonArea h = new Ex0007_HexagonArea();

        Scanner sc = new Scanner(System.in);
        System.out.print("Length of a side of the hexagon: ");
        double N = sc.nextDouble();
        System.out.print("Area of the hexagon: " + h.hexagonArea(N));

    }
}
