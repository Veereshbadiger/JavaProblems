import java.util.List;

public class referanceOperator {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> messages = List.of("Hello", "World");
        messages.forEach(referanceOperator::printMessage);

        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
  
    }
}
