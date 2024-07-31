public class Ex0039_EnvironmentProperties {
    public void printProperties() {
        System.out.println("This is the system properties file");
        System.out.println(System.getProperties());
    }

    public static void main(String[] args) {
        Ex0039_EnvironmentProperties prop = new Ex0039_EnvironmentProperties();
        prop.printProperties();
    }
}
