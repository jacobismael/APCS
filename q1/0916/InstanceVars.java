public class InstanceVars{
    //Below are instance variables / fields
    //and they exist throughout the class
    private int one = 8, two = 3; 
    private int answer; 
    public String name = "Jose";
 
 
    //(1) What does this method do?
	// it adds the one variable to the two variable
    public void add(){
        answer = one + two;
        int three = 33;
    }
 
    //(2) What does this method do?
	// prints out the answer
    public void print(){
        //(3) Can you print answer?
		// yes because it is initialized out of any method class 
        System.out.println(answer);
 
        //(4) If you uncomment the code below, will it run? why?
        // System.out.println(three);
		// yes because it is inside the class but no because three isnt created until add() is called
    }
 
}