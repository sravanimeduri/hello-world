class Employee{
int employee_id;
String empName;
long mobileNumber;
char gender;
double salary;
 static String empdesg;
static String company_name;
}

class variable{
	 public static void main(String args[ ] ){
	 Employee rajesh=new Employee();
	 rajesh.employee_id=45675;
	 rajesh.empName="Rajesh";
	 rajesh.mobileNumber=9999999999L;
	 rajesh.gender='M';
	 rajesh.salary=25000.00;
	 Employee.empdesg="QA";
	 Employee.company_name="JNIT";

	 Employee ramesh=new Employee();
	 ramesh.employee_id=45675;
	 ramesh.empName="Rajesh";
	 ramesh.mobileNumber=9999999999L;
	 ramesh.gender='M';
	 ramesh.salary=25000;
	 System.out.println("================= Rajesh employee details=========");
	 System.out.println("employee id"+rajesh.employee_id);
	 System.out.println("employee Name"+rajesh.empName);
	 System.out.println("employee Mobile Number"+rajesh.mobileNumber);
	 System.out.println("employeeGender"+rajesh.gender);
	 System.out.println("employee Salary"+rajesh.salary);
	 System.out.println("employee Designation"+Employee.empdesg);
	 System.out.println("employee Company Name"+Employee.company_name);

	 System.out.println("================= Ramesh employee details=========");
	 System.out.println("employee id"+ramesh.employee_id);
	 System.out.println("employee Name"+ramesh.empName);
	 System.out.println("employee Mobile Number"+ramesh.mobileNumber);
	 System.out.println("employee Gender"+ramesh.gender);
	 System.out.println("employee Salary"+ramesh.salary);
	 System.out.println("employee Designation"+Employee.empdesg);
	 System.out.println("employee Company Name"+Employee.company_name);


	 }

	 }

