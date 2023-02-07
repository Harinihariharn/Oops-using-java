import java.io.*;
import java.util.*;
class Matrix
{
public static void main(String[] args)
{
int i,j;
int n,m;
System.out.println("no of rows");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col");
m=s.nextInt();
int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];
System.out.println("Enter the element1");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}}
System.out.println("1st matrix");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{ 
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("the element2 is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=s.nextInt( );
}
}
System.out.println("the 2 matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println(" ");
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("the sum of the matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("the transpose of the matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[j][i]+" ");
}
System.out.println(" ");
}
}
}



