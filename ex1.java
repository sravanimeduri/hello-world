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
ravi.id=2020;
ravi.salary=17000;
Employee.companyName="motivitylabs";
System.out.println("=================employee details=========");
System.out.println("employee id"+ravi.id);
System.out.println("employee Salary"+ravi.salary);
System.out.println("employeeCompany Name"+Employee.companyName);
System.out.println("=================Student details=========");
Student ramya=new Student();
ramya.rollnum=466;
ramya.name="Ramya";
ramya.sectionName="A";
Student.schoolName="Z.P.H";
System.out.println("student Roll Number"+ramya.rollnum);
System.out.println("student  Name"+ramya.name);
System.out.println("student Section"+ramya.sectionName);
System.out.println("student Schoolname"+Student.schoolName);

}

}