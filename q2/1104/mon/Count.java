public class Count {
  public int getFactorial(int x) {
    int count = x;
    int total = 1;
    while(count > 0) {
      total *= count;
      count--;
    }
    return total;
  }
}
