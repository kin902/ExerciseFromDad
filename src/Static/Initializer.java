package Static;

public class Initializer {
    static int initialValue = 0;

    static Initializer getInstance() {
        return new Initializer();
    }

    static {
        System.out.println(initialValue);
        initialValue += 1000;
    }

    public String toString() {
        return initialValue + "";
    }
}
