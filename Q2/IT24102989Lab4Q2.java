import java.util.Scanner;

public class IT24102989Lab4Q2 {

     public static void main(String[] args){

          Scanner input = new Scanner(System.in);

          int examMarks;
          int labMarks;
          int examMarksPerc;
          int labMarksPerc; 
          int finalExamMark;
          int finalLabMark;
          int finalMarks;

          System.out.println("Please enter exam marks(out of 100):");
          examMarks = input.nextInt();

          if (examMarks<0 || examMarks>100) {
          System.out.println("Invalid input for exam marks. Terminating program.");
          System. exit(0);
          }

          System.out.println("Please enter lab submission marks(out of 100): ");
          labMarks = input.nextInt();

          if (labMarks<0 || labMarks>100) {
          System.out.println("Invalid Lab Mark");
          System. exit(0);
          }

          System.out.println("Please enter Percentage given for the exam: ");
          examMarksPerc = input.nextInt();

          System.out.println("Please enter Percentage given for the Lab submission: ");
          labMarksPerc = input.nextInt();

          if (examMarksPerc + labMarksPerc != 100) {
          System.out.println("The percentages must add up to 100. Terminating program.");
          System. exit(0);
          }

          finalExamMark = examMarks*examMarksPerc/100;
          finalLabMark = labMarks*labMarksPerc/100;

          finalMarks = finalExamMark + finalLabMark;

          System.out.println("Final Exam Mark: " + finalMarks);

      }

}