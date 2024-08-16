import java.util.Scanner;

public class IT24102989Lab4Q3 {
  public static void main(String[] args) {
  
       Scanner input = new Scanner(System.in);
  
       System.out.println("Enter a Number: ");
       int numToCheck = input.nextInt();

       String result = (numToCheck > 0) ? "The number is Positive":
                       (numToCheck < 0) ? "The number is Negative":
                       "This number is Zero" ;

       System.out.println(result);

   }

}