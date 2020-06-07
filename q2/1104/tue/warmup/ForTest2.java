public class ForTest2 {
  public void printCount(int x, int y) {
    for(int i = x; i<y; i++) {
      System.out.println(i);
    }
  }

  public int getSum(int x) {
    int total = 0;
    for(int i = 1; i< x; i++) {
      total += i;
    }
    return total;
  }
}
