import java.util.*;
import java.util.stream.Collectors;


public class Stream {
	public static void main(String[] args) {
		List<Integer> list1=List.of(10,23,29,86,9,56,84);
		
		
		//using Stream API
		
	   List<Integer> newList= list1.stream()
			                 .filter(i->i%2==0)
			                 .collect(Collectors.toList());
	   
	   System.out.println(newList);
	   
	   List<Integer> newList2=newList.stream()
			                   .filter(i->i>20)
			                   .collect(Collectors.toList());
	   
	   System.out.println(newList2);
	   
		
	}

}
