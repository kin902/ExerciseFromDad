import java.util.Scanner;
import java.lang.Math;

public class Ex0008_PolygonArea {
    public double polygonArea(double length, int side) {
        return (side * length * length) / (4 * Math.tan(Math.PI / side));
    }
    public static void main(String[] args) {
        Ex0008_PolygonArea p = new Ex0008_PolygonArea();

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of side of the hexagon: ");
        int side = sc.nextInt();
        System.out.print("Length of a side of the hexagon: ");
        double length = sc.nextDouble();
        System.out.print("Area of the polygon: " + p.polygonArea(length, side));
    }
}
