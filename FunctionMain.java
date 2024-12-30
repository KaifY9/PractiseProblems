import java.util.function.Function;

public class FunctionMain {
  public static void main(String []kaif) {
	  
	  String[]words = {"kaif ","Shaikh","i am a java developer with 2 years of Experience"};
	  
	  //here we are defining and creating anonymous inner class 
	    Function<String,String>function = new Function<String,String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.toUpperCase();
			}
	    	
	    };
	    
	    for(String s :words) {
	    	;
	    	System.out.println(function.apply(s));
	    }
	  
  }
}
