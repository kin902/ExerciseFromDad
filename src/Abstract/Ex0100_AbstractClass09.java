package Abstract;

public class Ex0100_AbstractClass09 {
    public static void main(String[] args) {
        Glockenspiel glockenspiel = new Glockenspiel();
        Violin violin = new Violin();

        glockenspiel.play();
        violin.play();

        glockenspiel.tune();
        violin.tune();
    }
}

abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {
    public void play() {
        System.out.println("Playing the notes on the metal bars");
    }

    public void tune() {
        System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch");
    }
}

class Violin extends Instrument {
    public void play() {
        System.out.println("Violin: Playing the strings with a bow or fingers");
    }

    public void tune() {
        System.out.println("Violin: Tuning the strings to the correct pitch");
    }
}