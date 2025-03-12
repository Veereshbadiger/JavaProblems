package JavaBasics;
public class Singleton {
    // Private static instance variable
    private static Singleton instance = null;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Show message
        singleton1.showMessage();

        // Check if both instances are the same
        System.out.println(singleton1 == singleton2);  // Output: true
    }
}