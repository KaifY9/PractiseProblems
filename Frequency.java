import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] kaif) {
		// TODO Auto-generated method stub

		List<Integer>list = 
	    Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,2,2,3,3,4,1,5,6,7,8,9);
	    
	    System.out.println(list);
	    
		
	    //to find frequency we can convert into HashMap
	    
	    Map<Integer,Long>frequencyMap = list.stream().collect(Collectors.groupingBy(n -> n ,Collectors.counting())); 
	    
	    frequencyMap.forEach((key,value)->
	    System.out.println(key+":"+value));
		
	    
	    //////////////////////////Userdefined
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //create arraylist
	    List<Integer>userList = new ArrayList<>();
	    System.out.println("Enter the Number to store in the arrayList");
	    int n = sc.nextInt();
	    
	    //TO store numbers in the list
	    for(int i =0;i<n;i++) {
	    	int number = sc.nextInt();
	    	userList.add(number);
	    }
	    System.out.println("The entered list is "+userList);
	    System.out.println("The Frequency of Numbers entered from the user is");
	    
	    Map<Integer,Long>frequencyUserMap=userList.stream().
	    		collect(Collectors.groupingBy(N->N,Collectors.counting()));
	    
	    frequencyUserMap.forEach((key,value)->System.out.println(key+":"+value));
	    
	    
	    
	    
		
	}

}
