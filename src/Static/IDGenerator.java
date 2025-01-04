package Static;

public class IDGenerator {
    static int nextID = 0;

    static int generateID() {
        return ++nextID;
    }
}
