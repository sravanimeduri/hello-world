class University{
void listofColleges(){
System.out.println("1.SMCE 2.KIT 3.CR 4.GKC");
}
void selectClg(String collageCode){
System.out.println("Selcted Colleage Code  " +collageCode);
}

void selectClg(String collageCode1,String collageCode2){
System.out.println("Selcted Colleage Code  " +collageCode1+" and " + collageCode2);
}
void selectClg(String collageCode1,String collageCode2,String collageCode3){
System.out.println("Selcted Colleage Code  " +collageCode1+" and "+ collageCode2 + " and  "+ collageCode3);
}



String seatAlloted(){
return "SMCE";
}

int clgFee(){
return 70000;
}

String feePay(int amount){
System.out.println("Amount Paid is"+amount);
return "paid";
}

}
class Student{
public static void main(String args[]){

University admisions=new University();
admisions.listofColleges();
admisions.selectClg("SMCE");
admisions.selectClg("SMCE","KIT");
admisions.selectClg("SMCE","KIT","CR");
System.out.println("Seat Alloted Colleage  is"+admisions.seatAlloted());
System.out.println("Fee To Pay is  "+admisions.clgFee());
System.out.println(" Fee Status is "+admisions.feePay(70000));


}

}