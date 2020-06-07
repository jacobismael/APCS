public class WarmUp {
  public boolean isbetween1and10(int x) {
    if(x >= 1 && x <= 10) {
      return true;
    } else {
      return false;
    }
  }

  public int getFactorial(int x) {
    int runner = x;
    int total = 1;
    while(runner != 0) {
      total *= runner;
      runner--;
    }
    return total;
  }
}
