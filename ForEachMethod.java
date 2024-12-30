import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		 System.out.println(list);  
//		 
//		 //how to iterate the list
//		 
//		 for(int i =0;i<list.size();i++) {
//			 System.out.println(list.get(i));
//		 }
		
		 //Iterator class
		 
//		 Iterator<Integer> itr = list.iterator();
//		 while(itr.hasNext()) {
//			 System.out.println(itr.next());
//		 }
		 
		 //for each
		 
//		 for(int el :list) {
//			 System.out.println(el);
//		 }

		 //for each method
		 Consumer<Integer> consumer =t-> System.out.println(t);
	
		 
		 list.forEach(consumer);
		 
		 
		 
	}

}
