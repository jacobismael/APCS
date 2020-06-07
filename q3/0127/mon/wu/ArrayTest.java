public class ArrayTest {
    private String[] words;

    public ArrayTest() {
        words = new String[]{"Saaranng 1", "Saarang 2", "Saarang 3", "Saarang 4", "Saarang 5"};
    }

    public void printWords() {
        for(String x : words) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public void swapWords(int index1, int index2) {
        String temp = words[index2];
        words[index2] = words[index1];
        words[index1] = temp;
    }
}