package nestedclasess;

class Test{  
	  static int data=30;  
	  static class Inner{  
	   static void msg(){
		   System.out.println("data is "+data);
		   }  
	   }
	  }  

public class Staticinnerclsex2 {

	 public static void main(String args[]){  
		  Test.Inner.msg(); 
		  }  

}
