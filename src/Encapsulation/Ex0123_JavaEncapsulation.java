package Encapsulation;

public class Ex0123_JavaEncapsulation {
    public static void main(String[] args) {
        Smartphone Apple = new Smartphone();

        Apple.setter("Apple", "Iphone 14", 256);
        Apple.getter();
        Apple.increaseStorage(256);
        Apple.getter();
    }

    static class Smartphone {
        private String brand;
        private String model;
        private int storageCapacity;

        public void setter(String brand, String model, int storageCapacity){
            this.brand = brand;
            this.model = model;
            this.storageCapacity = storageCapacity;
        }

        public void getter() {
            System.out.println(this.brand + ", " + this.model + ", " + this.storageCapacity + " GB");
        }

        public void increaseStorage(int increaseAmount) {
            this.storageCapacity += increaseAmount;
        }
    }
}
