public class ArrayTest {
    private String[] words;

    public ArrayTest() {
        words = new String[5];
        words[0] = "Sebastian Woo";
        words[1] = "Saarang Bondalapati";
        words[2] = "Adam Dailey";
        words[3] = "Cye";
        words[4] = "Christina Zhao";
    }

    public void printWords() {
        for(String x : words) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void swapWords(int index1, int index2) {
        String temp = words[index1];
        words[index1] = words[index2];
        words[index2] = temp;
    }
}