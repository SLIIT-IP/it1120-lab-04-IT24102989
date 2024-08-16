import java.util.Scanner;
public class IT24102989Lab4Q1{
   public static void main (String[]args){

    Scanner scanner = new Scanner(System.in);
   
    int number = 0;

    System.out.println("Enter number");
    number = scanner.nextInt();

    if (number > 0) {
         System.out.println("Positive number");

    } else if (number < 0) {
         System.out.println("Negetive number");

    } else {
         System.out.println("Zero");

    }
   
  }

}

   