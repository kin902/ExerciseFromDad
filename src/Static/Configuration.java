package Static;

public class Configuration {
    static int configValue = 0;

    static {
        configValue = 100;
    }

    public String toString() {
        return configValue + "";
    }
}
