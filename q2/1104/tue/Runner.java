public class Runner {
    public static void main(String[] args) {
        NestedLoops runner = new NestedLoops();

        runner.drawFilledBox();
        System.out.println();
        runner.drawFilledBox(4, 5);
        System.out.println();
        runner.drawMultiChart();
        System.out.println();
        runner.drawTriangle();
    }
}