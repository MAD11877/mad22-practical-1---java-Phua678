import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  { 
    System.out.print("Enter your height in Metres:");
    Scanner in= new Scanner(System.in); 
    double height = in.nextDouble();
    System.out.print("Enter your weight in kg: "); 
    double weight = in.nextInt();
    System.out.println("Your Height is " + height + " m and your weight is " + weight + " KG");  
  }
}
