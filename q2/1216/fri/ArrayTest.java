public class ArrayTest {
    private int[] numbers;

    public ArrayTest(int length) {
        this.numbers = new int[length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10 + 5);
        }
    }

    public void print() {
        for(int x : numbers) {
            System.out.println(x);
        }
    }

    public int sum13() {
        int total = 0;
        for(int x : numbers) {
            if(x != 13) {
                total += x;
            }
        }
        return total;
    }
}