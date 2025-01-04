package Encapsulation;

public class Ex0117_JavaEncapsulation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setter(6, 10);
        rectangle.getter();
    }

    static class Rectangle {
        private int length;
        private int width;

        public void getter () {
            System.out.println("Length" + length + "cm");
            System.out.println("Width" + width + "cm");
        }

        public void setter (int widthIn, int lengthIn) {
            this.length = lengthIn;
            this.width = widthIn;
        }
    }
}
