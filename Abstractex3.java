abstract class Employee{
abstract void name();
abstract void designation();
void display(){
System.out.println("JNIT Organisation");
}
}
class Qa extends Employee{
void name(){
System.out.println("Sravani ");
}
void designation(){
System.out.println("QA");
}
}
class Dev extends Employee{
void name(){
System.out.println("Ramya ");
}
void designation(){
System.out.println("Developer");
}
}

class Abstract{
public static void main(String args[]){

Employee emp=new Qa();
emp.display();
emp.name();
emp.designation();
emp=new Dev();
emp.display();
emp.name();
emp.designation();

}
}