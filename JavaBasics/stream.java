import java.util.List;

public class stream {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers, map to their squares, sort in descending order, and collect to a list
        List<Integer> result = numbers.stream()
                          .filter(n -> n % 2 == 0)
                          .map(n -> n * n)
                          .sorted((a, b) -> b - a)
                          .toList();

        result.forEach(System.out::println);

        // Find the sum of the first 10 natural numbers
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);
        
        System.out.println(sum);
        
        // Find the sum of the squares of the first 10 natural numbers
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n)
                                  .reduce(0, (a, b) -> a + b);
        
        System.out.println(sumOfSquares);

        // Find the sum of the squares of the first 10 natural numbers using the sum() method
        int sumOfSquares2 = numbers.stream()
                                   .map(n -> n * n)
                                   .reduce(0, Integer::sum);

        System.out.println(sumOfSquares2);

        // The map() method can be replaced with the mapToInt() method
        int sumOfSquares4 = numbers.stream()
                       .mapToInt(n -> n * n)
                       .reduce(0, Integer::sum);

        System.out.println(sumOfSquares4);


        // The reduce() method can be replaced with the sum() method
        int sumOfSquares3 = numbers.stream()
                                   .mapToInt(n -> n * n)
                                   .sum();

        System.out.println(sumOfSquares3);

        // The sum() method can be replaced with the sum() method of the IntStream interface
        // The mapToInt() method can be replaced with the map() method
        int sumOfSquares5 = numbers.stream()
                                   .mapToInt(n -> n * n)
                                   .sum();
                                
        System.out.println(sumOfSquares5);
        // The reduce() method can be replaced with the sum() method of the IntStream interface
    }
    
}
