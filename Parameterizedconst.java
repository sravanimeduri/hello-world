class Student{
int stuId;
String name;
String courseName;
String courseDuration;
Student(int stuId,String name,String courseName,String courseDuration){
this.stuId=stuId;
this.name=name;;
this.courseName=courseName;
this.courseDuration=courseDuration;
}

void display(){
System.out.println("Student Id "+stuId);
System.out.println("Student Name "+name);
System.out.println("Student Course Name  "+courseName);
System.out.println("Student Course Duration "+courseDuration);
}

}
class Parameterized{
public static void main(String rgs[]){
Student ramya=new Student(4112,"Ramya","Java","3months");
ramya.display();

Student ramesh=new Student(4142,"Ramesh","Testing","4months");
ramesh.display();
}
}
