class Employee{
int id;
int salary;
static String companyname;
}
class Student{
int rollnum;
String name;
String sectionname;
static String schoolname;
}


class variable{
public static void main(String args[ ] ){
Employee ravi=new Employee();
ravi.id=2020;
ravi.salary=17000;
Employee.companyname="motivitylabs";
System.out.println("=================employee details=========");
System.out.println("employee id"+ravi.id);
System.out.println("employee Salary"+ravi.salary);
System.out.println("employeeCompany Name"+Employee.companyname);
System.out.println("=================Student details=========");
Student ramya=new Student();
ramya.rollnum=466;
ramya.name="Ramya";
ramya.sectionname="A";
Student. schoolname="Z.P.H";
System.out.println("student Roll Number"+ramya.rollnum);
System.out.println("student  Name"+ramya.name);
System.out.println("student Section"+ramya.sectionname);
System.out.println("student Schoolname"+Student. schoolname);

}

}