import java.util.*;
import java.util.stream.Collectors;

public class StreamFunction {
   public static void main(String[] args){
	   List<String> names=List.of("Priyansu","Nishant","Yash","Shawk","Rashi","Rishi","Pushkar");
	   
	   List<String> newNames=names.stream()
			   .filter(e-> e.startsWith("P"))
			   .filter(e->e.length()>7)
			   .collect(Collectors.toList());
	   
	   System.out.println(newNames);
	   
   }
}
