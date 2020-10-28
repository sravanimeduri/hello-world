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
	sravani.studentId=466;
	sravani.studentName="Sravani";
	Student.section="ClassA";
	sravani.english=80;
	sravani.maths=95;
	sravani.science=85;
	sravani.social=80;
	sravani.telugu=85;
	sravani.hindi=75;
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
	ramya.studentId=467;
	ramya.studentName="Ramya";
	ramya.english=84;
	ramya.maths=97;
	ramya.science=88;
	ramya.social=90;
	ramya.telugu=85;
	ramya.hindi=80;
	
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
