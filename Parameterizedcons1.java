class Employee{
int empId;
String empName;
int salary;
Employee(int empId,String empName,int salary){
this.empId=empId;
this.empName=empName;
this.salary=salary;
}

void display(){
System.out.println("Employee Id "+empId);
System.out.println("Employee Name "+empName);
System.out.println("Employee Salary "+salary);
}

}
class Parameterizedconst{
public static void main(String args[]){
Employee sravani=new Employee(466,"Sravani",15000);
 sravani.display();
Employee suresh=new Employee(166,"Suresh",35000);
suresh.display();
}
}
