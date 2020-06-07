public class Runner {
    public static void main(String[] args) {
        ArrayTest runner = new ArrayTest(10);

        runner.print();

        System.out.println();

        boolean x = runner.search(5);
        System.out.println(x);
    }
}