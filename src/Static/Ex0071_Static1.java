package Static;

public class Ex0071_Static1 {

    public static void main(String[] args) {
        Counter counter1 = Counter.getCounter();
        Counter counter2 = Counter.getCounter();
        Counter counter3 = Counter.getCounter();

        System.out.println(counter1);
        System.out.println(counter2.equals(counter3));

    }
}
