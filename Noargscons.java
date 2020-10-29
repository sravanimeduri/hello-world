class Employee{
int empId;
String empName;
int salary;
Employee(){
empId=4212;
empName="Sravani";
salary=15000;
}

void display(){
System.out.println("Employee Id "+empId);
System.out.println("Employee Name "+empName);
System.out.println("Employee Salary "+salary);
}

}
class Constructor{
public static void main(String args[]){
Employee sravani=new Employee();
 sravani.display();
}
}
