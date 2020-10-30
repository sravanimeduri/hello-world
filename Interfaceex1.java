interface Vehicle{
public void cost();
public void milage();
}
abstract class Car {
abstract void viper();
void display(){
System.out.println("Press Unlockbotton open Door and start Car");
}
}
abstract class Bike {
abstract void stand();
void displaybike(){
System.out.println("Pull the choke to start a Bike ");
}
}

class Audi extends Car implements Vehicle{
public void cost(){
System.out.println("Audi Cost is 50lakhs");
}
public void milage(){
System.out.println("Audi Milaget is 10km");
}
public void viper(){
System.out.println("Viper is Off");
}
}
class Bmw extends Car implements Vehicle{
 public void cost(){
System.out.println("Bmw Cost is 40lakhs");
}
 public void milage(){
System.out.println("Bmw Milaget is 15km");
}
 public void viper(){
System.out.println("Viper is ON");
}
}
class Fz extends Bike implements Vehicle{
 public void cost(){
System.out.println("Fzi Cost is 2 lakhs");
}
public void milage(){
System.out.println("Fzi Milaget is 15km");
}
public void stand(){
System.out.println("Park the bike a side using stand");
}
}
class Apache extends Bike implements Vehicle{
public void cost(){
System.out.println("Apache Cost is 1 lakhs");
}
public void milage(){
System.out.println("Apache Milaget is 17km");
}
public void stand(){
System.out.println("Park the bike a side using stand");
}
}

class Mechines{
public static void main(String ags[]){
Audi audi=new Audi();
audi.display();
audi.cost();
audi.milage();
audi.viper();

Bmw bmw=new Bmw();
bmw.display();
bmw.cost();
bmw.milage();
bmw.viper();

Fz fz=new Fz();
fz.displaybike();
fz.cost();
fz.milage();
fz.stand();

Apache apache=new Apache();
apache.displaybike();
apache.cost();
apache.milage();
apache.stand();


}
}