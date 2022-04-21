import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
int i,j,rows;
 Scanner in = new Scanner(System.in);
     //System.out.print("Enter the number of rows: ");
     rows = in.nextInt();

 for(i=rows;i<=rows;i--)
     {
         for(j=0;j<=i;j++)
         {
             System.out.print("* ");
         }
         System.out.println("");
     } 
    
  }
}
