import java.util.function.Predicate;

public class PredicateExmp {
	
	public static void main(String []args) {
    
		//int[]arrs = {1,2,3,4,5,6,7,8};
    
//		Predicate<Integer>predicate = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				return  t%2==0;
//			}
//		};
		
		//this can be reduced by lamda expression
		
		//Predicate<Integer>predicate = t-> t%2==0;
		
		
		//example 2
		
		String arrs[]= {"raju","kaju","maju"};
		
		Predicate<String>predicate=name->name.startsWith("r"); 
		
		
		
//		for(int k:arrs) {
//			if(predicate.test(k)) {
//				System.out.println(k);
//				
//			}
//		}
		for(String k:arrs) {
			if(predicate.test(k)) {
				System.out.println(k);
				
			}
		}
		
		
		
		
}
}
