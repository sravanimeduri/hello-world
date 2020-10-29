import java.util.Scanner;
class Employee{
int id;
int salary;
static String companyName;
}
class Student{
int rollnum;
String name;
String sectionName;
static String schoolName;
}
class variable{
public static void main(String args[]){
Employee ravi=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee Details ");

System.out.println("Enter employee id");
ravi.id=sc.nextInt();

System.out.println("Enter employee Salary");
ravi.salary=sc.nextInt();

System.out.println(" Enter employeeCompany Name");
Employee.companyName=sc.next();

System.out.println("=================employee details=========");
System.out.println("employee id"+ravi.id);
System.out.println("employee Salary"+ravi.salary);
System.out.println("employeeCompany Name"+Employee.companyName);

Student ramya=new Student();

System.out.println("Enter Student Details");
System.out.println("Enter student Roll Number");
ramya.rollnum=sc.nextInt();

System.out.println(" Enter student  Name");
ramya.name=sc.next();

System.out.println("Enter student Section");
ramya.sectionName=sc.next();

System.out.println(" Enter student Schoolname");
Student.schoolName=sc.next();

System.out.println("=================Student details=========");
System.out.println("student Roll Number"+ramya.rollnum);
System.out.println("student  Name"+ramya.name);
System.out.println("student Section"+ramya.sectionName);
System.out.println("student Schoolname"+Student.schoolName);

}

}