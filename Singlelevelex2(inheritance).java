class Square{
int a,b;

void Areas(int a){
this.a=a;
int area=a*a;
System.out.println("Area" +area);

}
}
class Sum extends Square{
void Circumtance(int a,int b){
this.a=a;
this.b=b;
int circumtance=2*a*b;
System.out.println(" Circumtance" +circumtance);
}

}
class Area{
public static void main(String args[]){

Sum sre=new Sum();
sre.Circumtance(3,4);
sre.Areas(5);
}
}