public class InstanceVarsRunner{
   public static void main(String[] args){
      //(1) What is the name of the reference variable?
	  // t
      InstanceVars test = new InstanceVars();
 
      //(2) What does this print?
	  // 0
      test.print();
 
      //(3) What happens to the variable answer of the InstanceVars class after you call test.add()?
      // it gets changed
	  test.add();
 
      //(4) What is the final result?
	  // 11
      test.print();
       
      //(5) Does the code below work and why?
      //System.out.println(name);
	  // no because its not sayin that its part of test and tere is no variable named name
       
   }
}