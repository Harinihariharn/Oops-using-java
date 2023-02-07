public class Test1
{
 public static void main(String[] args)
 {
 int[][] table = new int[3][3];
  int count = 0;
 for (int i= 0; i< table.length; i++)
  {
 for (int j= 0; j< table[0].length; j++)
 {
 table[i][j] = count;
 count++;
 System.out.print(table[i][j] + " ");
 }
 }
 }
 }
