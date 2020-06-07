public class OverloadedRunner{
    public static void main(String[] args){
        //(1) What is the difference between the two constructors?
		// the parameters are different
        Overloaded p1 = new Overloaded();
        Overloaded p2 = new Overloaded(16, "John");
         
        //(2) What is the difference between the outputs of p1 and p2? why?
		// the difference is that p1 will return the result of the default constructor while p2 will return the desired output
        p1.print();
        p2.print();
        System.out.println();
         
        //(3) What is the difference between the outputs of p1.print() and p1.print(5)? why?
		// pl.print(5) will use the local variable for the runner but p1.print() will use the instance variable updated by the contructor
        p1.print(5);
        System.out.println();
         
        //(4) What is the difference between the outputs of p1.print(5) and 
        //    p1.print("Henry")? why?
		// p1.print(5) will print the age but p1.print("Henry") will print the age because they are called the same but they have different parameters that identify them
        p1.print(5);
        p1.print("Henry");
    }
}