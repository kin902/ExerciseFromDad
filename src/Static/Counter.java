package Static;

public class Counter {
    static int counter = 0;

    public Counter() {
        counter++;
        System.out.println(counter);
    }

    static Counter getCounter() {
        return new Counter();
    }

    public String toString() {
        return "Counter: " + counter;
    }
}
