package Class;

public class Ex0064_Class08 {
    static class Point {
        int x;
        int y;

        public Point(int integer) {
            this.x = integer;
            this.y = integer;
        }

        public Point(double decimal) {
            this.x = (int) decimal;
            this.y = (int) decimal;
        }

        public String toString() {
            return "x: " + x + ", y: " + y;
        }
    }

    public static void main(String[] args) {
        Point point = new Point(2.62);
        System.out.println(point);
    }
}
