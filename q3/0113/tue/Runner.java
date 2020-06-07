public class Runner {
    public static void main(String[] args) {
        ArrayTest runner = new ArrayTest();

        runner.printNumArray();
        runner.printStringArray();
        runner.swapNumArray(0, 9);
        runner.printNumArray();
        runner.printStringArray();
        runner.swapStringArray(1, 2);
        runner.printStringArray();

        System.out.println(runner.searchString("1"));

        System.out.println();

        System.out.println(runner.countLetter('2'));
        System.out.println();
        System.out.println(runner.countLetter('u'));
    }
}