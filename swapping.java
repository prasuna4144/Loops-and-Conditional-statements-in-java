import java.util.Scanner;

public class swapping{
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();
      System.out.println("Before swapping:");
      System.out.println("num1 = " + num1);
      System.out.println("num2 = " + num2);
      int temp = num1;
      num1 = num2;
      num2 = temp;
      System.out.println("After swapping:");
      System.out.println("num1 = " + num1);
      System.out.println("num2 = " + num2);
      sc.close();
   }
}