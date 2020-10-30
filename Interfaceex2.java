interface Electronics{
 void cost();
 void ram();
void display();
}

abstract class Lapitop {
abstract void mouse();
abstract void keyboard();
void start(){
System.out.println("Press Power Button To Start");
}
}

abstract class Mobile {
abstract void cam();
abstract void powerbackup();
void startmob(){
System.out.println("Side to Unlock ");
}
}

class Lenovo extends Lapitop implements Electronics{
public void cost(){
System.out.println("Lenovo Cost is 35000");
}
public void ram(){
System.out.println("Lenovo RAM is 8GB");
}
public void display(){
System.out.println("Display area 32*32");
}
public void mouse(){
System.out.println("Lenovo has a mouse");
}
public void keyboard(){
System.out.println("Lenovo has a keyboard");
}
}
class Dell extends Lapitop implements Electronics{
public void cost(){
System.out.println("Dell Cost is 40000");
}
public void ram(){
System.out.println("Dell RAM is 8GB");
}
public void display(){
System.out.println("Display area 36*36");
}
public void mouse(){
System.out.println("Dell has a mouse");
}
public void keyboard(){
System.out.println("Dell has a keyboard");
}

}
class Realme extends Mobile implements Electronics{
public void cost(){
System.out.println("Realme Cost is 11000");
}
public void ram(){
System.out.println("Realme RAM is 4GB");
}
public void display(){
System.out.println("Display area 6.5inch");
}
public void cam(){
System.out.println("Realme has a front 138mp cam");
}
public void powerbackup(){
System.out.println("Realme has a 48hrs power backup");
}

}
class Oneplus extends Mobile implements Electronics{
public void cost(){
System.out.println("Oneplus Cost is 15000");
}
public void ram(){
System.out.println("Oneplus RAM is 4GB");
}
public void display(){
System.out.println("Display area 6.1inch");
}
public void cam(){
System.out.println("Oneplus has a front 138mp cam");
}
public void powerbackup(){
System.out.println("Oneplus has a 32hrs power backup");
}

}

class Mechines{
public static void main(String ags[]){
Lenovo lenovo=new Lenovo();
lenovo.cost();
lenovo.ram();
lenovo.display();
lenovo.start();
lenovo.mouse();
lenovo.keyboard();

Dell dell=new Dell();
dell.cost();
dell.ram();
dell.display();
dell.start();
dell.mouse();
dell.keyboard();

Realme realme=new Realme();
realme.cost();
realme.ram();
realme.display();
realme.startmob();
realme.cam();
realme.powerbackup();

Oneplus oneplus=new Oneplus();
oneplus.cost();
oneplus.ram();
oneplus.display();
oneplus.startmob();
oneplus.cam();
oneplus.powerbackup();


}
}