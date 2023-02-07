import java.io.*;
import java.util.*;
class dia
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int flag=0;
System.out.println("no of rows of arr");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col array ");
m=s.nextInt();
int a[][]=new int[n][m];
int b[][]=new int[n][m];
System.out.println("enter the elements of array1 are");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println(" the elements of array 1are");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("the diagonal elements are");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(i==j)
System.out.println(a[i][j]+" ");
}
System.out.println(" ");
}
}}