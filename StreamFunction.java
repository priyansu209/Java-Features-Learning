import java.util.*;
import java.util.stream.Collectors;

// Example program demonstrating filtering with Java Stream API
public class StreamFunction {
    public static void main(String[] args) {
        
        // Create an immutable list of names
        List<String> names = List.of("Priyansu", "Nishant", "Yash", "Shawk", "Rashi", "Rishi", "Pushkar");

        // ------------------------------------------------------
        // Apply multiple filters using Stream API
        // ------------------------------------------------------
        // 1. filter(e -> e.startsWith("P"))
        //    -> keeps only names starting with the letter 'P'
        //
        // 2. filter(e -> e.length() > 7)
        //    -> keeps only names with length greater than 7 characters
        //
        // 3. collect(Collectors.toList())
        //    -> gathers the result back into a new list
        List<String> newNames = names.stream()
                                     .filter(e -> e.startsWith("P"))
                                     .filter(e -> e.length() > 7)
                                     .collect(Collectors.toList());

        // Print the final filtered list
        System.out.println("Names starting with 'P' and having length > 7: " + newNames);

        //using map() function
	   // map() takes a function and return a value
	   
	   List<Integer> nums= new ArrayList<>();
	   nums.add(6);
	   nums.add(5);
	   nums.add(9);
	   nums.add(3);
	   nums.add(8);
	   
	   
	   List<Integer>numsStream=nums.stream()
	   .map(i->i*i).collect(Collectors.toList());
	   
	   System.out.println(numsStream);
	   
    }
}

