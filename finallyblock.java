package ExceptionsPractise;

public class finallyblock {
 public static void main(String[] args) {
	int[]a= new int[5];
	System.out.println("Hello WOrldd");
	
	try {
		System.out.println(a[3]);
	}
	//if we are not getting any excpetion then we will not go in catch block
	 catch(Exception e) {
		 System.out.println("EXecution Handler");
		 
	 }
	//if try has error and dont have catch block still it wll run the finally block 
	finally {
		System.out.println("I will run always");

		//impt notes when finally block does not execute
		//1)Use of System.exit() method 
		//2)An exception occurs in the finally block
		//3)the death of a thread

		
	}
	 
	System.out.println("End of Code");
	
	
/*Notes
	
	
	
	*/
}
}
