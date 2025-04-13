public class Singleton {
    private static Singleton instance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Static method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
