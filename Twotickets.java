import java.io.*;
class onlineticket
{
int ticket;
String row;
float price;
}
class Twotickets
{
public static void main(String []args)
{
onlineticket t1=new onlineticket();
onlineticket t2=new onlineticket();
t1.ticket=2;
t1.row="king";
t1.price=100.50f;
t2.ticket=3;
t2.row="queen";
t2.price=160.50f;
System.out.println(t1.ticket+" "+t1.row+" "+t1.price);
System.out.println(t2.ticket+" "+t2.row+" "+t2.price);
}
}
