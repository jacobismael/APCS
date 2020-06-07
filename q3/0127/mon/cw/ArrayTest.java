import java.util.ArrayList;

public class ArrayTest {
    private ArrayList<Integer> numList= new ArrayList<Integer>();

    public ArrayTest(int x) {
        for(int i = 0; i < x; i++) {
            numList.add((int)(Math.random() * 15 + 1));
        }
    }

    public void print() {
        for(int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i)+" ");
        }
        System.out.println();
    }

    public void printBackwards() {
        for(int i = numList.size()-1; i >= 0; i--) {
            System.out.print(numList.get(i)+" ");
        }
        System.out.println();
    }
}