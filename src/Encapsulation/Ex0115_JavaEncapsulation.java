package Encapsulation;

public class Ex0115_JavaEncapsulation {
    public static void main(String[] args) {
        Person newAccount = new Person();

        newAccount.setter("England", "John", 21);
        newAccount.getter();
    }

    static class Person {
        private String name;
        private int age;
        private String country;

        public void getter() {
            System.out.println(name + " " + age + " " + country);
        }

        public void setter(String country, String name, int age) {
            this.name = name;
            this.age = age;
            this.country = country;
        }
    }
}



