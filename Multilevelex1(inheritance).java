class Electronics{
void Electronics(){
System.out.println("Electronics");
}
}
class Mobile extends Electronics{
void Mobile(){
System.out.println("Mobile");
}
}
class Realme extends  Mobile{
void Realmemobile(){
System.out.println("Realme Mobile");
}
}
class Multilevel{
public static void main(String args[]){
  Realme mob=new Realme();
  mob.Realmemobile();
  mob.Mobile();
  mob.Electronics();
}
}