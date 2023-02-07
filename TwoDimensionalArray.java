import java.io.*;
class TwoDimensionalArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int columns=sc.nextInt();
int a[][]=new int[rows][columns];
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++);
{
a[i][j]=sc.nextInt();
}
}
System.out.print("Elements in Array are:\n");
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
System.out.println(a[i][j]);
}
}
}
}

