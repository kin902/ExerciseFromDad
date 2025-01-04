package InnerClass;

public class Ex0074_InnerClass03 {
    public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.startEngine();
    }
}

class Car {
    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running...");

            }
        }

        Engine carSEngine = new Engine();
        carSEngine.run();
    }
}