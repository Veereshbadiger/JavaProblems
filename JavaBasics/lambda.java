package JavaBasics;
import java.util.function.BiConsumer;

public class lambda {
    public static void main(String[] args) {
        // Example of a lambda expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Example of a lambda expression with multiple statements
        Runnable runnable2 = () -> {
            System.out.println("Hello, Lambda!");
            System.out.println("Hello, Lambda!");
        };
        runnable2.run();

        // Example of a lambda expression with parameters
        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        };
        biConsumer.accept("Alice", 30);

        // The type of the parameters can be inferred
        // The parentheses can be omitted if there is only one parameter
        // The return type can be inferred if the lambda body has a single expression
        // The curly braces can be omitted if the lambda body has a single expression
        // The return keyword can be omitted if the lambda body has a single expression
        // The return keyword must be used if the lambda body has multiple statements
        // The return type must be specified if the lambda body has multiple statements
        // The parentheses must be used if there are no parameters
        // The parentheses must be used if there are multiple parameters
        // The parentheses must be used if the type of the parameters is specified
        // The parentheses must be used if the lambda body has multiple statements
        // The parentheses must be used if the lambda body has a single expression
        // The parentheses must be used if the return type is specified
    }
}
