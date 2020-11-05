package exceptionHandeling;


public class ExceptionHandelingex6 {
	
	public static void main(String[] args) throws Exception {		
		
		int age=17;
		if(age>=18)
	      System.out.println("Eligible for Vote"); 
		else
			throw new Exception("Not Eligible for Vote");

	}


}
