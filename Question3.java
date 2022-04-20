import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    System.out.print("Input an integer:");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int answer = number*number; 
    System.out.println("Your answer is " + answer);  
  }
}
