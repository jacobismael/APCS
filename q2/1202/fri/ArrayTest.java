public class ArrayTest {
    private int[] nums;

    public ArrayTest(int size){
        nums = new int[size];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 5 + 1);
        }
    }

    public void print() {
        for(int x : nums) {
            System.out.println(x);
        }
    }

    public boolean search(int x) {
        for(int i : nums) {
            if(i == x) {
                return true;
            }
        }
        return false;
    }
}