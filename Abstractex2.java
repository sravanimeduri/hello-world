abstract class Mobile{
abstract void ram();
abstract void camera();
void start(){
System.out.println("Side to unlock");
}
}

class Realme extends Mobile{
void ram(){
System.out.println(" Realme Ram is 4GB");
}
void camera(){
System.out.println("Front Cam 130pixels");
}
}

class Oneplus extends Mobile{
void ram(){
System.out.println(" Oneplus  Ram is 8GB");
}
void camera(){
System.out.println("Front Cam 160pixels");
}
}
class Abstract{
public static void main(String args[]){
Mobile x=new Realme();
x.start();
x.ram();
x.camera();

x=new Oneplus();
x.start();
x.ram();
x.camera();

}
}