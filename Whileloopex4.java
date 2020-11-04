package loops;

public class Whileloopex4 {

	public static void main(String[] args) {
		int fact=1,sum=0,rem,n =345;
		while(n>0) {
			rem=n%10;
			fact=1;
			while(rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			n=n/10;
			
			
		}
		System.out.println("Sum is"+sum);
	}

}
