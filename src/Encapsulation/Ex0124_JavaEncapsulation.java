package Encapsulation;

public class Ex0124_JavaEncapsulation {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();

        desktop.setter("Windows", "Intel Quad-Core i5", 8);
        desktop.getter();
        desktop.upgradeRam(8);
        desktop.getter();
    }

    static class Desktop {
        private String brand;
        private String processor;
        private int ramSize;

        public void setter(String brand, String processor, int ramSize){
            this.brand = brand;
            this.processor = processor;
            this.ramSize = ramSize;
        }

        public void getter() {
            System.out.println("brand: " + brand);
            System.out.println("processor: " + processor);
            System.out.println("ramSize: " + ramSize + " GB");
        }

        public void upgradeRam(int ram) {
            this.ramSize += ram;
        }
    }
}
