public class ForRunner {
  public static void main(String[] args) {
    ForTest runner = new ForTest();
    runner.printCount();
    System.out.println();
    runner.printCount(10);
    System.out.println();
    runner.printCount(5, 20);
    System.out.println();
    int x = runner.getFactorial(5);
    System.out.println(x);
  }
}
