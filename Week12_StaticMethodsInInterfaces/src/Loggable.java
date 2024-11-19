
public interface Loggable {

    static void log(String message) {
        System.out.println("Log: " + message);
    }

    void displayMessage(String message);
}