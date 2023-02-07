import java.util.*;
import java.io.*;
class applogin{
      int id;
    String name;
    void insertRecord(int r,String n)
    {
     id=r;
    name=n;
    }
    
void displayInformation(){
 System.out.println(id+" "+name);
}
}
class Testlogin{
    public static void main(String args[]){
        applogin a1=new applogin();
        applogin a2=new applogin();
        
        a1.insertRecord(12,"pugal");
        a2.insertRecord(13,"aishu");
        
        a1.displayInformation();
        a2.displayInformation();
        
      
        System.out.println("Testlogin");

    }
}