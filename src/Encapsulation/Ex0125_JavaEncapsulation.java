package Encapsulation;

public class Ex0125_JavaEncapsulation {
    public static void main(String[] args) {
        House house = new House();

        house.setter("GH1109", 4, 94);
        house.getter();
        System.out.println("$ " + house.calculatePrice());
    }

    static class House {
        String address;
        int numberOfRooms;
        double area;

        public void setter(String address, int numberOfRooms, double area) {
            this.address = address;
            this.numberOfRooms = numberOfRooms;
            this.area = area;
        }

        public void getter() {
            System.out.println("Address: " + address);
            System.out.println("Number of Rooms: " + numberOfRooms);
            System.out.println("Area: " + area + " m2");
        }

        public double calculatePrice() {
            return area * 12;
        }
    }
}
