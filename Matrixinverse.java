import java.util.*;
import java.io.*;
class Matrixinverse
{
public static void main(String args[])
{
int n,m;
int i;
int j;
System.out.println("no of rows of arr");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col array ");
m=s.nextInt();
int a[][]=new int[n][m];
System.out.println("Enter the elements array1 is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the elements is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}