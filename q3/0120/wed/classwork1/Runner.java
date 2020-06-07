public class Runner {
    public static void main(String[] args) {
        ArrayTest runner = new ArrayTest();

        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10 + 1);
        }

        runner.printArray(nums);
        runner.scramble(nums);
        runner.printArray(nums);
        runner.sort(nums);
        runner.printArray(nums);

        String[] words = new String[]{"one", "two", "three", "four", "five"};
        
        runner.printArray(words);
        runner.scramble(words);
        runner.printArray(words);
    }
}