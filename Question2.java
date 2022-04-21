import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  { 
    //System.out.print("Enter your height in metres:");
    Scanner in= new Scanner(System.in); 
    double height = in.nextDouble();
    System.out.println(height);
    //System.out.print("Enter your weight in kg: "); 
    double weight = in.nextInt();
    System.out.println(weight);
    double bmi = weight/((height)*(height));
    //System.out.println("Your BMI is " + bmi);  
    System.out.println(bmi);
  }
}
