public class Review {
    private int[] numList;

    public Review() {
        numList = new int[5];
        for(int i = 0; i < numList.length; i++) {
            numList[i] = (int)(Math.random() * 10 + 1);
        }
    }

    public void printList() {
        for(int x : numList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void scramble() {
        for(int i = 0; i < numList.length; i++) {
            int tempI = (int)(Math.random() * numList.length);
            int temp = numList[tempI];

            numList[tempI] = numList[i];
            numList[i] = temp;
        }
    }

    public void sort() {
        for(int i = 0; i < numList.length; i++) {
            for(int j = 0; j < numList.length; j++) {
                if(numList[i] < numList[j]) {
                    int temp = numList[i];
                    numList[i] = numList[j];
                    numList[j] = temp;
                }
            }
        }
    }
}