public class Runner {
    public static void main(String[] args) {
        Review runner = new Review();

        runner.printList();
        System.out.println();
        System.out.println("Scramble");
        runner.scramble();
        runner.printList();
        System.out.println();
        System.out.println("Sort:");
        runner.sort();
        System.out.println();
        runner.printList();
    }
}