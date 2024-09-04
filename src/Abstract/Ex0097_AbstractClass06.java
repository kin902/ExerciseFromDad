package Abstract;

public class Ex0097_AbstractClass06 {
    public static void main(String[] args) {
        Cube cube = new Cube(7);
        System.out.println(cube.calculateArea() + " cm2");
        System.out.println(cube.calculateVolume() + " cm3");
    }
}

abstract class Shape3D {
    abstract int calculateArea();

    abstract int calculateVolume();
}

class Cube extends Shape3D {
    int Side_Length;
    public Cube(int Side_Length) {
        this.Side_Length = Side_Length;
    }

    int calculateArea() {
        return (Side_Length * Side_Length) * 6;
    }

    int calculateVolume() {
        return Side_Length * Side_Length * Side_Length;
    }
}