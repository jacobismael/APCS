public class ArrayTest {
    
    public void printArray(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void printArray(String[] arr) {
        for(String x : arr) {
            System.out.println(x);
        }
    }

    public void scramble(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int tempI = (int)(Math.random() * arr.length);
            int temp = arr[tempI];

            arr[tempI] = arr[i];
            arr[i] = temp;
        }
    }

    public void scramble(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int tempI = (int)(Math.random() * arr.length);
            String temp = arr[tempI];

            arr[tempI] = arr[i];
            arr[i] = temp;
        }
    }

    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}