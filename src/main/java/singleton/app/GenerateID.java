package singleton.app;

public class GenerateID {
    private GenerateID() {
    }

    private static GenerateID instance = new GenerateID();

    public static GenerateID getInstance() {
        return instance;
    }

    private int id = 0;

    public int novoId() {
        return ++id;
    }
}