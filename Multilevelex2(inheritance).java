class Sports{
void Sports(){
System.out.println("Sports");
}
}
class Indoor extends Sports{
void Indoor(){
System.out.println("Indoor");
}
}
class Chess extends  Indoor{
void Chessgame(){
System.out.println("Chess Game");
}
}
class Multilevel{
public static void main(String args[]){
  Chess game=new Chess();
  game.Chessgame();
   game.Indoor();
  game.Sports();
}
}