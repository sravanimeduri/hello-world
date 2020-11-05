package exceptionHandeling;

public class ExceptionHandelingex3 {

	public static void main(String[] args) {
		int a=10,b=5;
		String name="Sravani";
		int c[]=new int[5];  
		
		System.out.println("Statement-1");
		try {
			System.out.println("Statement-2 div"+(a/b));
			System.out.println(name.length());
			c[10]=50;
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();	
		}
		
		catch(NullPointerException np){
			np.printStackTrace();	
		}
		catch(ArrayIndexOutOfBoundsException aie){
			aie.printStackTrace();
		}
		
		System.out.println("Statement-3");
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		System.out.println("Statement-7");
		System.out.println("Statement-8");
		

	}

}
