public class Runner {
    public static void main(String[] args) {
        ArrayTest runner = new ArrayTest(10);

        runner.print();
        System.out.println();
        int x = runner.sum13();
        System.out.println(x);
    }
}