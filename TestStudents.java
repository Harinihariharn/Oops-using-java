import java.io.*;
import java.util.*;
class Student
{
int rollno;
String name;

void InsertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();

s1.insertRecord(111,"karan");
s2.insertRecord(121,"Aryan");

s1.displayInformation();
s2.displayInformation();

System.out.println("TestStudent");
}
}
