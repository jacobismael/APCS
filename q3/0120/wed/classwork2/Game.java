public class Game {
    private int[] nums;
    private int index;

    public Game() {
        nums = new int[10];
        index = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        scramble();
    }

    public void scramble() {
        for(int i = 0; i < nums.length; i++) {
            int tempI = (int)(Math.random() * nums.length);
            int temp = nums[tempI];

            nums[tempI] = nums[i];
            nums[i] = temp;
        }
   }

   public int getNumber() {
       index++;
       return nums[index - 1];
   }


}