import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{ Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++,System.out.print("\n"))
{
for(j=1;j<=n+1;j++)
{
if(i==5||i==8)
{
System.out.print("#");
}
else if
{ 
System.out.println(" ");
}
else if((j==3 || j==4) && j==n-3 || j==n-4 i=n-9)
{
System.out.print("*");
}
else if((j==2 || j==3)&& j==n-1 || j==n-2 i=n-8)
{
System.out.print("*");
}
else if(j==n-9 || j==n-10,i=n-7)
{
System.out.print("#");
}
else if(j==n-9 || j==n-10,i=n-6)
{
System.out.print("#");
}
else if(j==n-9 || j==n-10,i=n=5)
{
System.out.print("#");
}
else if(j==n-9 || j==n-10,i=n-4)
{
System.out.print("#");
}
else if(j==n-9 || j==n-10,i=n-3)
{
System.out.print("#");
}
else if((j==n-3 || j==n-4, i==n-2)
{
System.out.print("#");
}
else if((j==3 || j==4) && j==n-3 || j==n,i=n-1)
{
System.out.print("*");
}
else if((j==5 || j==8 i==n)
{
System.out.print("*");
}
else
{
ystem.out.print(" ");
}
}
}
}
}