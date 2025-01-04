package InnerClass;

public class Ex0075_InnerClass04 {

    public static void main(String[] args) {
        English British = new English();
        British.sayHello();
    }
}

interface Greeting {
    void sayHello();
}

abstract class language implements Greeting {

    void sayHello(Greeting greeting) {
        System.out.println("Hello !");
    }
}

class English extends language {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}