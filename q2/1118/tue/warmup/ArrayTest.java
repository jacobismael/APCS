public class ArrayTest {
    private int[] numbers;

    public ArrayTest(int x) {
        numbers = new int[x];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 5 + 1);
        }
    }

    public void print() {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public int getSum() {
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }
}