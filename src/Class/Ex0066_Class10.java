package Class;

public class Ex0066_Class10 {
    public static class Singleton {
        private static Singleton singleInstance = null;

        private Singleton() {

            System.out.println("Singleton instance created");
        }

        public static Singleton getInstance() {
            if (singleInstance == null) {
                singleInstance = new Singleton();
            }
            return singleInstance;
        }

    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("They are the same!");
        }
        else {
            System.out.println("They are not the same!");
        }
    }
}
