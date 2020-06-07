public class ArrayTest {
    public void arrayDemo6() {
        System.out.println("Demo 6");
        System.out.println();

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }

        for(int x : arr) {
            System.out.println(x);
        }

        arr[5] = 0;

        for(int x : arr) {
            System.out.println(x);
        }
    }

    public void arrayDemo7() {
        System.out.println("Demo 7");
        System.out.println();

        String[] arr = {"one", "two", "three", "four", "five"};

        for(String x : arr) {
            System.out.println(x);
        }
    }

    public void arrayDemo8(String x) {
        System.out.println("Demo 8");
        System.out.println();

        String[] arr = {"dog", "bird", "cat", "bear", "cow"};

        boolean found = false;

        for(int i =0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Found at index " + i);
                found = true;
            }
        }

        if(!found) {
            System.out.println("Could not find file");
        }
    }
}