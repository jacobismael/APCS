public class For{
    public void test1(){
        //1) Describe what is happening below?
        // the method counts from 0 to 9 inclusive
        System.out.println("\n\nTest1");
        for(int i=0; i < 10; i++){
            System.out.println(i);
        }
    }

    public void test2(){
        //2) Describe what is happening below?
        // the method counts from 15 to 3 by 2 inclusive
        System.out.println("\n\nTest2");
        for(int i=15; i > 2; i--){
            System.out.println(i);
        }
    }

    public void test3(int max){
        //3) Describe what is happening below?
        // the method takes in an int parameter and counts from 0 to that number inclusive by 5
        System.out.println("\n\nTest3");
        for(int i=0; i <= max; i+=5){
            System.out.println(i);
        }
    }

    public void test4(int min, int max){
        //4) Describe what is happening below?
        // the method takes in two parameters, min and max, and prints from the first number to the second number inclusive, respectively
        System.out.println("\n\nTest4");
        for(int i=max; i > min; i-=2){
            System.out.println(i);
        }

    }

    //5)What makes a for loop more useful than a while loop?
    // a for loop can be used for quick functions
}
