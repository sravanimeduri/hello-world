class ExMethodOverloading{

void addition(){
int a=10;
int b=20;
int c;
c=a+b;
System.out.println("Addition is"+c);
}

void addition(int a,int b){
int c;
c=a+b;
System.out.println("Addition is"+c);
}

void addition(int a,int b,int c){
int d;
d=a+b+c;
System.out.println("Addition is"+d);
}

void addition(int a,int b, int c,int d){
int e;
e=a+b+c+d;
System.out.println("Addition is"+e);
}

}
class  Variables{

public static void main(String args[]) {
		ExMethodOverloading obj = new ExMethodOverloading();
		obj.addition();

		obj.addition(10,20);
		
		obj.addition(10, 20, 30);

		obj.addition(10, 20, 30,40);

	}
}
