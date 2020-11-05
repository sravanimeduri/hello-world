package exceptionHandeling;

public class ExceptionHandelingex5 {

	public static void main(String[] args) {		
		System.out.println("Statement-1");
		String s="abc";
		try {
			int i=Integer.parseInt(s);	
		}		
		catch(NumberFormatException   e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Statement-3");
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		System.out.println("Statement-7");
		System.out.println("Statement-8");
		

	}

}
