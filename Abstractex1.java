abstract class Car{
abstract void cost();
abstract void milage();
void start(){
System.out.println("Starts with a Key");
}
}

class Audi extends Car{
void cost(){
System.out.println("Audi Cost is 50lakhs");
}
void milage(){
System.out.println("Audi Milaget is 10km");
}
}

class Bmw extends Car{
void cost(){
System.out.println("Bmw Cost is 40lakhs");
}
void milage(){
System.out.println("Bmw Milaget is 15km");
}
}
class Abstract{
public static void main(String args[]){
Car x=new Audi();
x.start();
x.cost();
x.milage();

x=new Bmw();
x.start();
x.cost();
x.milage();

}
}