import java.util.ArrayList;
public class Test {
  private ArrayList<Integer> numList;

  public Test() {
    numList = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++){
      int num = (int)(Math.random() * 10 + 1);
      numList.add(num);
    }
  }

  public void printList(){
    for(int each: numList){
      System.out.print(each + " ");
    }
    System.out.println();
  }
  public int searchLargest(){
    int largest = 0;
    for(int i = 0; i < numList.size(); i++){
      if(numList.get(i) > largest){
        largest = numList.get(i);
      }
    }
    return largest;
  }
  public void searchAndReplace(int num){
    for(int i = 0; i  < numList.size(); i++){
      if(numList.get(i) == num){
        numList.set(i, 1000);
        i--;
      }
    }
  }
  
  public void searchAndRemove(int x) {
    for(int i = 0; i < numList.size(); i++) {
      if(numList.get(i) == x) {
        numList.remove(i);
        i--;
      }
    }
  }
  public void scramble(){
    for(int i = 0; i < numList.size(); i++){
      int ind = (int)(Math.random() * numList.size());
      
      int temp = numList.get(i);

      numList.set(i, numList.get(ind));
      numList.set(ind, temp);
    }
  }
  
  
  
}
