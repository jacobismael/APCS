public class Runner {
    public static void main(String[] args) {
      Test test = new Test();
      test.printList();
      int x = test.searchLargest();
      System.out.println(x);
      test.searchAndReplace(5);
      test.printList();
      test.searchAndRemove(2);
      test.printList();
      test.scramble();
      test.printList();
    }
  }