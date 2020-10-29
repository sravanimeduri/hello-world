class Restuarant{
void menu(){
System.out.println("1.Idly 2.Dosa 3.Wada 4.Poori");
}
void takeOrder(String order){
System.out.println("Order given is"+order);
}
String serveFood(){
return "Dosa";
}
int giveBill(){
return 421;
}
String payBill(int amount){
System.out.println("Amount Paid is"+amount);
return "paid";
}
}
class Customer{
public static void main(String args[]){
 Restuarant ohris=new Restuarant();
ohris.menu();
ohris.takeOrder("Dosa");
System.out.println("Food Served is"+ohris.serveFood());
System.out.println(" Give Bill as "+ohris.giveBill());
System.out.println("Bill Status "+ohris.payBill(421));

}
}