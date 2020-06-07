public class ForTest {
  public void printCount() {
    for(int i = 1; i<=100; i++) {
      System.out.println(i);
    }
  }

  public void printCount(int x) {
    for(int i = 1; i<=x; i++) {
      System.out.println(i);
    }
  }

  public void printCount(int y, int x) {
    for(int i = y; i<=x; i++) {
      System.out.println(i);
    }
  }

  public int getFactorial(int x) {
    int total = 1;
    for(int i = x; i>0; i--) {
      total *= x;
    }
    return total;
  }
}
