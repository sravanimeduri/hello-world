package exceptionHandeling;

public class ExceptionHandelingex4 {

	public static int[] arrayOfNumbers=new int[10];

	public static void main(String[] args) {
		 
		
		System.out.println("Statement-1");
		try {
			arrayOfNumbers[10] = 11;
			
		}
		
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		System.out.println("Statement-3");
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		System.out.println("Statement-7");
		System.out.println("Statement-8");
		

	}

}
