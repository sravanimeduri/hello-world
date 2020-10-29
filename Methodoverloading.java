class Restuarant{
void menu(){
System.out.println("1.Idly 2.Dosa 3.Wada 4.Poori");
}

void takeOrder(String order){
System.out.println("Order given is"+order);
}

void takeOrder(String order1,String order2){
System.out.println("Order given is"+order1+ " and "+order2);
}

void takeOrder(String order1,String order2,String order3){
System.out.println("Order given is"+order1+" and "+order2+ "  "+order3);
}

}
class Customer{
public static void main(String args[]){
Restuarant ohris=new Restuarant();
ohris.menu();
ohris.takeOrder("Dosa");
ohris.takeOrder("Dosa","Idly");
ohris.takeOrder("Dosa","Idly","Poori");
}
}
