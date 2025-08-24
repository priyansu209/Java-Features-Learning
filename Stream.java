import java.util.*;
import java.util.stream.Collectors;

// Example program demonstrating the use of Java Stream API
// This code filters a list of integers using different conditions
public class Stream {
    public static void main(String[] args) {
        
        // Create an immutable list of integers
        List<Integer> list1 = List.of(10, 23, 29, 86, 9, 56, 84);

        // -------------------------------
        // Step 1: Filter even numbers only
        // -------------------------------
        // stream()     -> converts the list into a Stream
        // filter(...)  -> applies a condition (keep only even numbers)
        // collect(...) -> gathers the result back into a new List
        List<Integer> newList = list1.stream()
                                     .filter(i -> i % 2 == 0) // keep only even numbers
                                     .collect(Collectors.toList());

        // Print the filtered list (only even numbers)
        System.out.println("Even numbers: " + newList);

        // ----------------------------------------
        // Step 2: Further filter numbers > 20 only
        // ----------------------------------------
        List<Integer> newList2 = newList.stream()
                                        .filter(i -> i > 20) // keep only numbers greater than 20
                                        .collect(Collectors.toList());

        // Print the final filtered list
        System.out.println("Even numbers greater than 20: " + newList2);
    }
}
