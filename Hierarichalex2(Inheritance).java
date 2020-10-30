class Employee{
void display(){
System.out.println("JNIT Organisation");
}
}
class Qa extends Employee{
void name(){
super.display();
System.out.println("Sravani QA");
}
}
class Dev extends Employee{
void name(){
super.display();
System.out.println("Ramya Developer");
}
}

class Hierarchical{
public static void main(String args[]){

Qa qa=new Qa();
Dev dev=new Dev();
qa.name();
dev.name();

}
}