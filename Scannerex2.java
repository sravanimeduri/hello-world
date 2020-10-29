import java.util.Scanner;
class Employee{
int employee_id;
String empName;
long mobileNumber;
double salary;
 static String empdesg;
static String company_name;
}

class variable{
	 public static void main(String args[ ] ){
	 Employee rajesh=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Details ");

	 rajesh.employee_id=sc.nextInt();
	 rajesh.empName=sc.next();
	 rajesh.mobileNumber=sc.nextLong();
	 rajesh.salary=sc.nextDouble();
	 Employee.empdesg=sc.next();
	 Employee.company_name=sc.next();

                  System.out.println("================= employee details=========");
	 System.out.println("employee id"+rajesh.employee_id);
	 System.out.println("employee Name"+rajesh.empName);
	 System.out.println("employee Mobile Number"+rajesh.mobileNumber);
	 System.out.println("employee Salary"+rajesh.salary);
	 System.out.println("employee Designation"+Employee.empdesg);
	 System.out.println("employee Company Name"+Employee.company_name);


	 Employee ramesh=new Employee();
	 ramesh.employee_id=sc.nextInt();
	 ramesh.empName=sc.next();
	 ramesh.mobileNumber=sc.nextLong();
	 ramesh.salary=sc.nextDouble();
	 
	 System.out.println("================= employee details=========");
	 System.out.println("employee id"+ramesh.employee_id);
	 System.out.println("employee Name"+ramesh.empName);
	 System.out.println("employee Mobile Number"+ramesh.mobileNumber);
	 System.out.println("employee Salary"+ramesh.salary);
	 System.out.println("employee Designation"+Employee.empdesg);
	 System.out.println("employee Company Name"+Employee.company_name);


	 }

	 }

