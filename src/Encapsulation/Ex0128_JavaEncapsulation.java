package Encapsulation;

public class Ex0128_JavaEncapsulation {
    public static void main(String[] args) {
        Product product = new Product();

        product.setter("TH true milk", "KN410", 1.49);
        product.getter();
        System.out.println("$ " + product.applyDiscount(80));
    }

    static class Product {
        private String productName;
        private String productCode;
        private double productPrice;

        public void setter(String productName, String productCode, double productPrice) {
            this.productName = productName;
            this.productCode = productCode;
            this.productPrice = productPrice;
        }

        public void getter() {
            System.out.println("Product Name: " + productName);
            System.out.println("Product Code: #" + productCode);
            System.out.println("Product Price: $" + productPrice);
        }

        public double applyDiscount(double percentage) {
            return productPrice * percentage / 100;
        }
    }
}
