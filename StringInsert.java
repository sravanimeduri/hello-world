package exceptionHandeling;

public class StringInsert {

	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("Hello wor"); 
	        System.out.println("string = " + str); 
	        str.insert(9, "ld");
	        System.out.println("After Insertion string = " + str); 
	}

}
