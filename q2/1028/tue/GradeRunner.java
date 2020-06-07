import java.util.Scanner;
public class GradeRunner {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Input double score1:: ");
    double score1 = kb.nextDouble();
    System.out.print("Input double score2:: ");
    double score2 = kb.nextDouble();
    System.out.print("Input double score3:: ");
    double score3 = kb.nextDouble();

    Grade grade = new Grade(score1, score2, score3);
    boolean pass = grade.checkPass();
    System.out.println(pass);
  }
}
