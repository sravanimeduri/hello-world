class Employe{
int id;
String name;
char gender;
String desg;
Employe(){
id=3032;
name="Sravani";
gender='F';
desg="SoftwareDeveloper";
}

void display(){
System.out.println("Employee Id "+id);
System.out.println("Employee Name "+name);
System.out.println("Employee Gender "+gender);
System.out.println("Employee Designation "+desg);
}

}
class Noargscons{
public static void main(String args[]){
Employe sravani=new Employe();
 sravani.display();
}
}
