public class ParametersTestRunner{
    public static void main(String[] args){
       ParametersTest testObj = new ParametersTest();
        
       //(1) Describe what is happening with the two lines of code below.
	   // first it is calculating the product of the two parameters inputed and then it is printing them.
       testObj.times(5, 7);
       testObj.printAnswer();
       System.out.println();
        
       //(2)  Describe what is happening with the two lines of code below.
	   // first it is calculating the quotient of the two inputed parameters and then it prints them
       testObj.divide(3, 2);
       testObj.printAnswerDec();
       System.out.println();
        
       //(3) Describe what is happening with the two lines of code below.
	   // first it is setting an instance variable to the inputed parameter and then it is printing it
       testObj.setWord("Hello Java.");
       testObj.printWord();
       System.out.println();
        
       //(4) Analyze the following 4 modifyAnswer* methods.
       //Which one of these work properly? and Why?
	   // only the first one works because of a multitude of factors. The variable it is changing is properly aligned with the parameter data type. The variable is defined outside the method. there is no this because there is no answer defined in the method
       testObj.modifyAnswer1(101);
       testObj.printAnswer();
        
       testObj.modifyAnswer2(102);
       testObj.printAnswer();
        
       testObj.modifyAnswer3(103);
       testObj.printAnswer();
        
       testObj.modifyAnswer4(104);
       testObj.printAnswer();
    }
}