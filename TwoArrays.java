import java.io.*;
import java.util.*;
public class TwoArrays
{
public static void main(String[] args)
{
int[] arr=newint[3][3];
scanner sc=new scanner(System.in);
for(int i=0;i<3;i++);
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("Printing elements...");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
{
System.out.println(arr[i][j]+"\t");
}
}
}
}