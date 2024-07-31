public class Ex0038_SystemEnvironment {
    public void printSystemEnvironment() {
        System.out.println("This is the system Environment");
        System.out.println(System.getenv());
    }

    public static void main(String[] args) {
        Ex0038_SystemEnvironment computer = new Ex0038_SystemEnvironment();
        computer.printSystemEnvironment();
    }
}
