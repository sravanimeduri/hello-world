package exceptionHandeling;

public class SplitStringex1 {

	public static void main(String[] args) {
		String name="Sravani@Meduri";
		String[] splitName = name.split("@", 2);
		for (String a : splitName) 
            System.out.println(a); 
		

	}

}
