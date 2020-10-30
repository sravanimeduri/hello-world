class Car{
void cost(){
System.out.println("No cost");
}
void milage(){
System.out.println("No Milage");
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
class Hierarchical{
public static void main(String args[]){
Audi audi=new Audi();
Bmw bmw=new Bmw();
audi.cost();
audi.milage();
bmw.cost();
bmw.milage();
}
}