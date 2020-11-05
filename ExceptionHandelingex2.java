package exceptionHandeling;

public class ExceptionHandelingex2 {

	public static void main(String[] args) {
		int a=10,b=5;
		String name=null;
		System.out.println("Statement-1");
		try {
			System.out.println("Statement-2 div"+(a/b));
			System.out.println(name.length());
		}
		catch(ArithmeticException ae){
			//System.out.println(ae.getMessage());
			ae.printStackTrace();	
		}
		
		catch(NullPointerException np){
			//System.out.println(np.getMessage());
			np.printStackTrace();	
		}
		
		System.out.println("Statement-3");
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		System.out.println("Statement-7");
		System.out.println("Statement-8");
		

	}

}
