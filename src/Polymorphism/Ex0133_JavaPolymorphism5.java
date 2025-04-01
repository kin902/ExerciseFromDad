package Polymorphism;

public class Ex0133_JavaPolymorphism5 {
    public static void main(String[] args) {

    }

    static class Sports {
        public void play() {
            System.out.println("Sports play");
        }
    }

    static class Football extends Sports {
        @Override
        public void play() {
            System.out.println("Football play");
        }
    }

    static class Basketball extends Football {
        @Override
        public void play() {
            System.out.println("Basketball play");
        }
    }

    static class Rugby extends Basketball {
        @Override
        public void play() {
            System.out.println("Rugby play");
        }
    }
}
