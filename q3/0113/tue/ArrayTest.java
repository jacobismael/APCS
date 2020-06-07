public class ArrayTest {
    private int[] numArray;
    private String[] strArray;

    public ArrayTest() {
        numArray = new int[20];
        strArray = new String[5];

        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = (int)(Math.random() * 20 + 1);
        }

        for(int i = 0; i < strArray.length; i++) {
            int num = (int)(Math.random() * 5 + 1);
            switch(num) {
                case 1:
                    strArray[i] = "one";
                    break;
                case 2:
                    strArray[i] = "two";
                    break;
                case 3:
                    strArray[i] = "three";
                    break;
                case 4:
                    strArray[i] = "four";
                    break;
                case 5:
                    strArray[i] = "five";
                    break;
            }
        }
    }

    public void printNumArray() {
        for(int x : numArray) {
            System.out.println(x);
        }
        System.out.println();
    }

    public void printStringArray() {
        for(String x : strArray) {
            System.out.println(x);
        }
        System.out.println();
    }

    public void swapNumArray(int index1, int index2) {
        int temp = numArray[index1];

        numArray[index1] = numArray[index2];
        numArray[index2] = temp;
    }

    public void swapStringArray(int index1, int index2) {
        String temp = strArray[index1];

        strArray[index1] = strArray[index2];
        strArray[index2] = temp;
    }

    public int searchString(String text) {
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(text)) {
                return i;
            }
        }
        return -1;
    } 

    public int countLetter(char letter) {
        int counter = 0;

        for(String x : strArray) {
            for(int i = 0; i < x.length(); i++) {
                if(x.charAt(i) == letter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}