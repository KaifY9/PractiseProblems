import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListPractise {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,5,6,8,9,10);
		  //System.out.println(list.contains(1));
		  List<String>newlist=list.stream().distinct().map(String::valueOf).collect(Collectors.toList()); 
		  System.out.println(newlist);
		
		  
		  
		  //even number from the list
		  List<Integer>evenlist=list.stream().filter(x->x%2==0).distinct().collect(Collectors.toList());
		  System.out.println(evenlist+"Here it  is even list");
		  
		  
		  Set<Integer>evenList = list.stream().filter(x->x%2==0).collect(Collectors.toSet());
		  
		  
		  //odd list
		  List<Integer>oddlist=list.stream().filter(x->x%2!=0).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		  System.out.println(oddlist+"Here it is odd list");
		  
		  //sum of square all the numbers 
		    int ans=list.stream().mapToInt(x->x*x).sum();
		    System.out.println(ans);
		  
		    //max
		     int max = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
		     System.out.println(max);
			    
		   //secondmax
		    int secondmax=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		    System.out.println(secondmax);
		    
		    //secondmax
		    int secondmaximumno = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		    		 System.out.println(secondmaximumno);
		  
		    		 
		  
				
		
		
	}

}
