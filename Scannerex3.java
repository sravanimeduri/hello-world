import java.util.Scanner;
class Student{
int studentId=466;
String studentName;
static String section;
int english;
int maths;
int science;
int social;
int telugu;
int hindi;

}

class Variables{
public static void main(String args[]){
	Student sravani=new Student();
	Scanner sc=new Scanner(System.in);
                  System.out.println("Enter StudentDetails ");

	sravani.studentId=sc.nextInt();
	sravani.studentName=sc.next();
	Student.section=sc.next();
	sravani.english=sc.nextInt();
	sravani.maths=sc.nextInt();
	sravani.science=sc.nextInt();
	sravani.social=sc.nextInt();
	sravani.telugu=sc.nextInt();
	sravani.hindi=sc.nextInt();
	float sravaniTotal=sravani.english+sravani.maths+sravani.science+sravani.social+sravani.telugu+sravani.hindi;
	float avgOfSravani=(sravaniTotal/600)*100;

	System.out.println("Student Id is:"+sravani.studentId);
	System.out.println("Student Name is:"+sravani.studentName);
	System.out.println("Student Course is:"+Student.section);
	System.out.println("English:"+sravani.english);
	System.out.println("Mathamatics:"+sravani.maths);
	System.out.println("Science:"+sravani.science);
	System.out.println("Social:"+sravani.social);
	System.out.println("Telugu:"+sravani.telugu);
	System.out.println("Hindi:"+sravani.hindi);
	System.out.println("Student Total Marks:"+sravaniTotal);
	System.out.println("Student Average:"+avgOfSravani);
	
	Student ramya=new Student();
	 System.out.println("Enter StudentDetails ");
	 ramya.studentId=sc.nextInt();
	 ramya.studentName=sc.next();
	 ramya.section=sc.next();
	 ramya.english=sc.nextInt();
	 ramya.maths=sc.nextInt();
	 ramya.science=sc.nextInt();
	 ramya.social=sc.nextInt();
	 ramya.telugu=sc.nextInt();
	 ramya.hindi=sc.nextInt();
	
	float ramyaTotal=ramya.english+ramya.maths+ramya.science+ramya.social+ramya.telugu+ramya.hindi;
	float avgOfRamya=(ramyaTotal/600)*100;
	
	
	System.out.println("Student Id is:"+ramya.studentId);
	System.out.println("Student Name is:"+ramya.studentName);
	System.out.println("Student Section Name is:"+Student.section);
	System.out.println("English:"+ramya.english);
	System.out.println("Mathamatics:"+ramya.maths);
	System.out.println("Science:"+ramya.science);
	System.out.println("Social:"+ramya.social);
	System.out.println("Telugu:"+ramya.telugu);
	System.out.println("Hindi:"+ramya.hindi);
	System.out.println("Student Total Marks:"+ramyaTotal);
	System.out.println("Student Average:"+avgOfRamya);
	
}
}
