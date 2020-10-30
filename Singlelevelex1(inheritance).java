 class one 
{
 void greet(){
 System.out.println("im greet");
 }
}
 class Two extends one
{
 void wish(){
 System.out.println("im wish");
 }
}
class InherEx1
{
 public static void main(String[] args)
 {
    Two two=new Two();
    two.greet();
    two.wish();
  }
}