package ExceptionsPractise;

public class trycatchExp {

	public static void main(String[] args) {
	
		int[]arr = new int[5];
		
		try {
			int knh = 1/0;
			//System.out.println(arr[1]);
			//System.out.println("Vishal Tasallali");
			int a = 0/1; //it will not exceute next line if the error is come in above line
		}
      catch(Exception e){
    	  System.out.println("Exceptions are handled by catch");
    	  System.out.println(e.getStackTrace());
    	  System.out.println(e.getMessage());
      }
		System.out.println("All code are Executed flow is maintained ");
	}

}
//abnromally band hota hai usko roknai k liye humlog use krrte hai try catch
//Arithmetict, IndexofEccepton,Nullpointer ,