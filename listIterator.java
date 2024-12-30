import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          List<String>list = new ArrayList<>();
		  list = Arrays.asList("Mango","Apple","Kiwi","Papaya"); 
		 
		  System.out.println(list.toString());
		  
		  //1 way to print the iterator
		  for(int i =0;i<list.size();i++) {
			  System.out.println("Fruits is"+list.get(i));
		  }
		//for each
		  for(String fruits :list) {
			  System.out.println("By using For each Loop"+fruits);
		  }
		  
		  for(String fruits:list) {
			  System.out.println("Fruits"+fruits);
		  }
		  
        //3rd
		  Iterator<String> fe = list.iterator();
		  while(fe.hasNext()) {
			  System.out.println("Iteratorlist"+fe.next());
		  }
		  
		  list.subList(0, 2);
		  System.out.println(list);
		  //System.out.println(list.subList(0, 2));
	}

}
